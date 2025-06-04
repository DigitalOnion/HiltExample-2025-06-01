package com.outerspace.hiltexperiment.data_layer

import android.util.Log
import javax.inject.Inject
import kotlin.random.Random

const val allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

class GameRules @Inject constructor() {
    fun randomPlay(): String {
        val ch = allChars[Random.nextInt(0, allChars.length - 1)]
        return ch.toString()
    }
}

interface GameBoardInterface {
    fun getRandomBoard(nCols: Int, nRows: Int): List<List<GameCell>>
}

class GameCell(val face: String) {
    fun
            onClick() {
        Log.d("GAME CELL", face)
    }
}

class GameBoard @Inject constructor(val gameRules: GameRules): GameBoardInterface {
    override fun getRandomBoard(nCols: Int, nRows: Int): List<List<GameCell>> {
        val board = List(nRows) { List(nCols) { GameCell(gameRules.randomPlay()) } }
        return board
    }
}
