package com.outerspace.hiltexperiment.data_layer.user_schema

abstract class Picture {
    @com.squareup.moshi.Json(name = "large")
    abstract var large: String

    @com.squareup.moshi.Json(name = "medium")
    abstract var medium: String

    @com.squareup.moshi.Json(name = "thumbnail")
    abstract var thumbnail: String
}
