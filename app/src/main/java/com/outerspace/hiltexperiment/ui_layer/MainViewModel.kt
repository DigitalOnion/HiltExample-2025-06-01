package com.outerspace.hiltexperiment.ui_layer

import androidx.lifecycle.ViewModel
import com.outerspace.hiltexperiment.data_layer.game.GameBoard
import com.outerspace.hiltexperiment.data_layer.game.GameBoardInterface
import com.outerspace.hiltexperiment.data_layer.game.GameCell
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val gameBoard: GameBoard
): ViewModel(), GameBoardInterface {

    override fun getGameBoard(nCols:Int, nRows: Int, scope: CoroutineScope): List<List<GameCell>> {
        return gameBoard.getGameBoard(nCols, nRows, scope)
    }
}