package com.example.appcartaovisita

import android.app.Application
import com.example.appcartaovisita.data.AppDatabase
import com.example.appcartaovisita.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}