package my.newapp.fsm.gpstracker.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import java.util.concurrent.Flow

@Dao
interface Dao {
    @Insert
    suspend fun insertTrack(trackItem: TrackItem)
    @Query("SELECT * FROM TRACK")
    fun getAllTracks(): kotlinx.coroutines.flow.Flow<List<TrackItem>>
}