package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class SearchResponseResponse(
    @Json(name = "Address") val address: AddressResponse,
    @Json(name = "Granularity") val granularity: String,
    @Json(name = "Status") val status: Int,
    @Json(name = "Stores") val stores: List<StoreResponse>
)