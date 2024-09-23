package com.betrybe.currencyview.data.api

import com.betrye.currencyview.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiLayer {

    val instance: ApiService by lazy {
        val retrofit = Retrofit
            .Builder().baseUrl("https://api.apilayer.com/exchangerates_data/")
            .addConverterFactory(GsonConverterFactory.create()).build();
        retrofit.create(ApiService::class.java)
    }
}