package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class ServiceIsOpenResponse(
    @Json(name = "Carryout") val carryout: Boolean,
    @Json(name = "Delivery") val delivery: Boolean,
    @Json(name = "DriveUpCarryout") val driveUpCarryout: Boolean
)