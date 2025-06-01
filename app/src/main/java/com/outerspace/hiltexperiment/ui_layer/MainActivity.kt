package com.outerspace.hiltexperiment.ui_layer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.outerspace.hiltexperiment.data_layer.GameBoard
import com.outerspace.hiltexperiment.data_layer.GameRules
import com.outerspace.hiltexperiment.ui.theme.HiltExperimentTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainVM: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            HiltExperimentTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GameScreen(
                        modifier = Modifier.padding(innerPadding),
                        mainVM
                    )
                }
            }
        }
    }
}

@Composable
fun GameScreen(modifier: Modifier = Modifier, mainVM: MainViewModel) {
    Text(
        text = "play: ${mainVM.getRandomBoard(4, 4).toString()}!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    HiltExperimentTheme {
        val gameRules = GameRules()
        val gameBoard = GameBoard(gameRules)
        var mainVM = MainViewModel(gameBoard)
        GameScreen(Modifier, mainVM)
    }
}