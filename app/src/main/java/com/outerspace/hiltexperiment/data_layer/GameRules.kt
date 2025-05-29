package com.outerspace.hiltexperiment.data_layer

interface GameRulesInterface {
    fun firstPlay(): String
}

open class GameRules: GameRulesInterface {
    override fun firstPlay(): String {
        return "A"
    }
}