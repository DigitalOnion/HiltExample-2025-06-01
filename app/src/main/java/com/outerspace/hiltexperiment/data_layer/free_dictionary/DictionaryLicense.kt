package com.outerspace.hiltexperiment.data_layer.free_dictionary

import com.squareup.moshi.Json

class DictionaryLicense {
    @Json(name = "name")
    var name: String? = null

    @Json(name = "url")
    var url: String? = null
}
