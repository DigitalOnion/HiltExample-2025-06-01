package com.outerspace.hiltexperiment.data_layer.game

import com.outerspace.hiltexperiment.data_layer.data.DictionaryApiService
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

interface GameBoardInterface {
    fun getGameBoard(nCols: Int, nRows: Int, scope: CoroutineScope): List<List<GameCell>>
}

// GameBoard
class GameBoard @Inject constructor(
    val gameRules: GameRules
): GameBoardInterface {

    override fun getGameBoard(nCols: Int, nRows: Int, scope: CoroutineScope): List<List<GameCell>> {
        gameRules.scope = scope
        val board = List(nRows) {
            rowIndex ->
            List(nCols) {
                colIndex ->
                val face = gameRules.keyFace(rowIndex * nCols + colIndex)
                GameCell(face, gameRules, scope)
            }
        }
        return board
    }
}