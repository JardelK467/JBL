package com.example.jbl.di

import com.example.jbl.JblAPI
import com.example.jbl.JblAPI.Companion.BASE_URL
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule =
    module {
        // Creates and maintains the singular retrofit instance throughout the apps lifecycle
        single<JblAPI> {
            Retrofit.Builder()
                .baseUrl(BASE_URL) // Base URL defined in JblAPI interface
                .addConverterFactory(GsonConverterFactory.create()) // Gson converter factory for JSON parsing
                .build()
                .create(JblAPI::class.java)
        }
    }
