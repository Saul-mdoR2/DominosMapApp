package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class ServiceMethodEstimatedWaitMinutesResponse(
    @Json(name = "Carryout") val carryout: CarryoutResponse,
    @Json(name = "Delivery") val delivery: DeliveryResponse
)