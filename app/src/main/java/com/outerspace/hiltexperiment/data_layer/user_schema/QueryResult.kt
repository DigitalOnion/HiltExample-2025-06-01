package com.outerspace.hiltexperiment.data_layer.user

import com.outerspace.hiltexperiment.data_layer.user_schema.Dob
import com.outerspace.hiltexperiment.data_layer.user_schema.Name
import com.outerspace.hiltexperiment.data_layer.user_schema.Picture

abstract class QueryResult {
    @com.squareup.moshi.Json(name = "gender")
    abstract var gender: String

    @com.squareup.moshi.Json(name = "name")
    abstract var name: Name

    @com.squareup.moshi.Json(name = "email")
    abstract var email: String

    @com.squareup.moshi.Json(name = "dob")
    abstract var dob: Dob

    @com.squareup.moshi.Json(name = "phone")
    abstract var phone: String

    @com.squareup.moshi.Json(name = "cell")
    abstract var cell: String

    @com.squareup.moshi.Json(name = "picture")
    abstract var picture: Picture

    @com.squareup.moshi.Json(name = "nat")
    abstract var nat: String
}
