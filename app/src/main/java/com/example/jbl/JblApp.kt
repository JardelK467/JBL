package com.example.jbl

import android.app.Application
import com.example.jbl.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class JblApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@JblApp)
            modules(DEPENDENCIES)
        }
    }

    companion object {
        private val DEPENDENCIES =
            listOf(
                appModule,
            )
    }
}
