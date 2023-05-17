package my.newapp.fsm.gpstracker.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [TrackItem::class], version = 1)
abstract class MainDB: RoomDatabase() {

    companion object{
        @Volatile
        var INSTANCE: MainDB? = null
        fun getDatabase(context:Context): MainDB{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDB::class.java,
                    "GpsTracker.db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}