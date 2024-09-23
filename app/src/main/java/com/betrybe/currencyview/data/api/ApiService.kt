package com.betrybe.currencyview.data.api

import androidx.constraintlayout.motion.widget.Key
import com.betrybe.currencyview.data.models.CurrencySymbolResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET("symbols")
    suspend fun getSymbols(@Header("apikey") apiKey: String ): Response<CurrencySymbolResponse>
}