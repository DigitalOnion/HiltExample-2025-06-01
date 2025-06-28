package com.outerspace.hiltexperiment.ui_layer

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.outerspace.hiltexperiment.data_layer.game.GameBoard
import com.outerspace.hiltexperiment.data_layer.game.GameBoardInterface
import com.outerspace.hiltexperiment.data_layer.game.GameCell
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val gameBoard: GameBoard
): ViewModel(), GameBoardInterface, GameUIInterface {

    val liveResult: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    override val scope = viewModelScope

    override fun evaluationResult(result: String) {
        liveResult.value = result
    }

    override fun getGameBoard(nCols:Int, nRows: Int, gameUi: GameUIInterface): List<List<GameCell>> {
        return gameBoard.getGameBoard(nCols, nRows, this)
    }
}