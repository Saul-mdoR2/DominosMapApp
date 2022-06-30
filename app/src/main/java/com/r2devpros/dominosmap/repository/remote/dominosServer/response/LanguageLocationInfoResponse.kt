package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class LanguageLocationInfoResponse(
    @Json(name = "en") val en: String,
    @Json(name = "es") val es: String
)