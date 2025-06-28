package com.outerspace.hiltexperiment.data_layer.game

import com.outerspace.hiltexperiment.ui_layer.GameUIInterface
import kotlinx.coroutines.CoroutineScope

class GameCell(val face: String,
               val rules: GameRules,
               ) {

    fun onClick() {
        rules.appendKey(face)
        val content = rules.content()
        rules.evaluateContent()
    }
}