package com.betrybe.currencyview.data.api

import com.betrybe.currencyview.data.models.CurrencyRateResponse
import com.betrybe.currencyview.data.models.CurrencySymbolResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {
    @GET("symbols")
    suspend fun getSymbols(
        @Header("apikey") apiKey: String
    ): Response<CurrencySymbolResponse>

    @GET("latest")
    suspend fun getRates(
        @Header("apikey") apiKey: String ,
        @Query("base") base: String
    ): Response<CurrencyRateResponse>
}