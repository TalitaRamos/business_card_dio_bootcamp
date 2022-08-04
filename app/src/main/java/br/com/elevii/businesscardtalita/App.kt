package br.com.elevii.businesscardtalita

import android.app.Application
import br.com.elevii.businesscardtalita.data.AppDatabase
import br.com.elevii.businesscardtalita.data.BusinessCardRepository

class App : Application() {
    val database by lazy {AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}