package com.outerspace.hiltexperiment.data_layer.user_schema

abstract class Info {
    @com.squareup.moshi.Json(name = "seed")
    abstract var seed: String

    @com.squareup.moshi.Json(name = "results")
    abstract var results: Int

    @com.squareup.moshi.Json(name = "page")
    abstract var page: Int

    @com.squareup.moshi.Json(name = "version")
    abstract var version: String
}
