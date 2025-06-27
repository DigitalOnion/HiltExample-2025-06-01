package com.outerspace.hiltexperiment.ui_layer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.outerspace.hiltexperiment.ui.theme.HiltExperimentTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainVM: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            HiltExperimentTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GameKeyboard(
                        modifier = Modifier.padding(innerPadding),
                        mainVM,
                        lifecycleScope
                    )
                }
            }
        }
    }
}

@Composable
fun GameKeyboard(modifier: Modifier = Modifier, mainVM: MainViewModel, scope: CoroutineScope) {
    val matrix = mainVM.getGameBoard(5, 7, scope)
    Column(modifier.fillMaxSize()) {
        Spacer(Modifier.fillMaxWidth().height(64.dp))
        matrix.forEach { row ->
            Spacer(Modifier.fillMaxWidth().height(4.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                row.forEach { cell ->
                    Button(onClick = { cell.onClick() }, modifier = Modifier, ) {
                        Text(cell.face,
                            modifier = Modifier.width(20.dp),
                            textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    HiltExperimentTheme {
        //val gameRules = GameRules()
        //val gameBoard = GameBoard(gameRules)
        //var mainVM = MainViewModel(gameBoard)
        //GameKeyboard(Modifier, mainVM, )
    }
}