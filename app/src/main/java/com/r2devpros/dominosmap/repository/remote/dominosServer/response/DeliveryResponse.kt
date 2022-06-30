package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class DeliveryResponse(
    @Json(name = "Max") val max: Int,
    @Json(name = "Min") val min: Int
)