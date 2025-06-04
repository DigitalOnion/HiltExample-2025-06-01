package com.outerspace.hiltexperiment.data_layer.user_schema

import com.outerspace.hiltexperiment.data_layer.user.QueryResult

abstract class UserResultSchema {
    @com.squareup.moshi.Json(name = "results")
    abstract var results: MutableList<QueryResult>

    @com.squareup.moshi.Json(name = "info")
    abstract var info: com.outerspace.hiltexperiment.data_layer.user_schema.Info
}
