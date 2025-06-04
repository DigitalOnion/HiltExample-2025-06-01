package com.outerspace.hiltexperiment.data_layer.user_schema

abstract class Dob {
    @com.squareup.moshi.Json(name = "date")
    abstract var date: String

    @com.squareup.moshi.Json(name = "age")
    abstract var age: Int
}
