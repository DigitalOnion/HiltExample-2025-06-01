package com.outerspace.hiltexperiment.data_layer

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
    fun getRandomBoard(nCols: Int, nRows: Int): List<List<String>>
}

class GameBoard @Inject constructor(val gameRules: GameRules): GameBoardInterface {
    override fun getRandomBoard(nCols: Int, nRows: Int): List<List<String>> {
        val board = List(nRows) { List(nCols) { gameRules.randomPlay() } }
        return board
    }
}
