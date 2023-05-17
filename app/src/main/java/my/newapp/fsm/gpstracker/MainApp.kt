package my.newapp.fsm.gpstracker

import android.app.Application
import my.newapp.fsm.gpstracker.db.MainDB

class MainApp : Application() {
    val database by lazy { MainDB.getDatabase(this) }
}