package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class AddressResponse(
    @Json(name = "City") val city: String,
    @Json(name = "CountyName") val countyName: String,
    @Json(name = "CountyNumber") val countyNumber: String,
    @Json(name = "PostalCode") val postalCode: String,
    @Json(name = "Region") val region: String,
    @Json(name = "Street") val street: String,
    @Json(name = "StreetName") val streetName: String,
    @Json(name = "StreetNumber") val streetNumber: String,
    @Json(name = "UnitNumber") val unitNumber: String,
    @Json(name = "UnitType") val unitType: String
)