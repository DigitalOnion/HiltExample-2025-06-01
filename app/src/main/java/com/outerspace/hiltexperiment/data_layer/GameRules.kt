package com.outerspace.hiltexperiment.data_layer

import javax.inject.Inject


class GameRules @Inject constructor() {
    fun firstPlay(): String {
        return "A"
    }
}