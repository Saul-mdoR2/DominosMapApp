package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class StoreCoordinatesResponse(
    @Json(name = "StoreLatitude") val storeLatitude: String,
    @Json(name = "StoreLongitude") val storeLongitude: String
)