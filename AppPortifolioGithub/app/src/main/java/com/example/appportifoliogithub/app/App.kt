package com.example.appportifoliogithub.app

import android.app.Application


class App : Application() {

    override fun onCreate() {
        super.onCreate()

        /*startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()*/
    }
}