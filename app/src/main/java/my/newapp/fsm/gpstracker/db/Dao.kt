package my.newapp.fsm.gpstracker.db

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface Dao {
    @Insert
    suspend fun insertTrack(trackItem: TrackItem)
}