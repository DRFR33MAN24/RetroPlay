package com.swordfish.lemuroid.app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface StoreGameDao {

    @Query("SELECT * FROM storegames")
    fun getAllStoreGames():Flow<List<StoreGame>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStoreGame(storegames: List<StoreGame>)

    @Query("DELETE FROM storegames")
    suspend fun deleteAllStoreGames()
}
