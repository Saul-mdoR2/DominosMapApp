package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class ServiceHoursDescriptionResponse(
    @Json(name = "Carryout") val carryout: String,
    @Json(name = "DeliverToMe") val deliverToMe: String,
    @Json(name = "Delivery") val delivery: String,
    @Json(name = "DriveUpCarryout") val driveUpCarryout: String
)