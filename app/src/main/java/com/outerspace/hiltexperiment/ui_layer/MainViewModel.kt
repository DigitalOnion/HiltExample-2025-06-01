package com.outerspace.hiltexperiment.ui_layer

import androidx.lifecycle.ViewModel
import com.outerspace.hiltexperiment.data_layer.GameBoard
import com.outerspace.hiltexperiment.data_layer.GameBoardInterface
import com.outerspace.hiltexperiment.data_layer.GameRules
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val gameBoard: GameBoard
): ViewModel(), GameBoardInterface {

    override fun getRandomBoard(nCols:Int, nRows: Int): List<List<String>> {
        return gameBoard.getRandomBoard(nCols, nRows)
    }
}