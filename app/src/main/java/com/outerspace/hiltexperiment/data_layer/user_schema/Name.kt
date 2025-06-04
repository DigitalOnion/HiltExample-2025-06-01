package com.outerspace.hiltexperiment.data_layer.user_schema

abstract class Name {
    @com.squareup.moshi.Json(name = "title")
    abstract var title: String

    @com.squareup.moshi.Json(name = "first")
    abstract var first: String

    @com.squareup.moshi.Json(name = "last")
    abstract var last: String
}
