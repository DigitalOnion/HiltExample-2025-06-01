package com.outerspace.hiltexperiment.data_layer.free_dictionary

import com.squareup.moshi.Json

class Definition {
    @Json(name = "definition")
    var definition: String? = null

    @Json(name = "synonyms")
    var synonyms: MutableList<Any?>? = null

    @Json(name = "antonyms")
    var antonyms: MutableList<Any?>? = null

    @Json(name = "example")
    var example: String? = null
}
