package com.outerspace.hiltexperiment.data_layer.game

import kotlinx.coroutines.CoroutineScope

class GameCell(val face: String,
               val rules: GameRules,
               val scope: CoroutineScope,
               ) {

    fun onClick() {
        rules.appendKey(face)
        val content = rules.content()
        rules.evaluateContent()
    }
}