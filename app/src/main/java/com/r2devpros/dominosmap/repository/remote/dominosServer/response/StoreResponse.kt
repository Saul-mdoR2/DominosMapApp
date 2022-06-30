package com.r2devpros.dominosmap.repository.remote.dominosServer.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class StoreResponse(
    @Json(name = "AddressDescription") val addressDescription: String,
    @Json(name = "AllowCarryoutOrders") val allowCarryoutOrders: Boolean,
    @Json(name = "AllowDeliveryOrders") val allowDeliveryOrders: Boolean,
    @Json(name = "AllowDuc") val allowDuc: Boolean,
    @Json(name = "AllowPickupWindowOrders") val allowPickupWindowOrders: Boolean,
    @Json(name = "ContactlessCarryout") val contactlessCarryout: String,
    @Json(name = "ContactlessDelivery") val contactlessDelivery: String,
    @Json(name = "HolidaysDescription") val holidaysDescription: String,
    @Json(name = "HoursDescription") val hoursDescription: String,
    @Json(name = "IsDeliveryStore") val isDeliveryStore: Boolean,
    @Json(name = "IsNEONow") val isNEONow: Boolean,
    @Json(name = "IsOnlineCapable") val isOnlineCapable: Boolean,
    @Json(name = "IsOnlineNow") val isOnlineNow: Boolean,
    @Json(name = "IsOpen") val isOpen: Boolean,
    @Json(name = "IsSpanish") val isSpanish: Boolean,
    @Json(name = "LanguageLocationInfo") val languageLocationInfo: LanguageLocationInfoResponse,
    @Json(name = "LocationInfo") val locationInfo: String,
    @Json(name = "Phone") val phone: String,
    @Json(name = "ServiceHoursDescription") val serviceHoursDescription: ServiceHoursDescriptionResponse,
    @Json(name = "ServiceIsOpen") val serviceIsOpen: ServiceIsOpenResponse,
    @Json(name = "ServiceMethodEstimatedWaitMinutes") val serviceMethodEstimatedWaitMinutes: ServiceMethodEstimatedWaitMinutesResponse,
    @Json(name = "StoreCoordinates") val storeCoordinates: StoreCoordinatesResponse,
    @Json(name = "StoreID") val storeID: String
)