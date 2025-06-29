package com.outerspace.hiltexperiment.ui_layer

import com.outerspace.hiltexperiment.data_layer.game.GameResultInterface
import kotlinx.coroutines.CoroutineScope

interface GameUIInterface {
    val scope: CoroutineScope
    fun evaluationResult(result: GameResultInterface)
}
