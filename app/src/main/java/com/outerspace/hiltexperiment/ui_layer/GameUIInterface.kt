package com.outerspace.hiltexperiment.ui_layer

import kotlinx.coroutines.CoroutineScope

interface GameUIInterface {
    val scope: CoroutineScope
    fun evaluationResult(result: String)
}
