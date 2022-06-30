package com.r2devpros.dominosmap.core

import android.app.Application
import com.r2devpros.dominosmap.BuildConfig
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        Timber.d("MyApp_TAG: onCreate: ")

        startKoin {
            printLogger(level = Level.ERROR)
        }
    }
}