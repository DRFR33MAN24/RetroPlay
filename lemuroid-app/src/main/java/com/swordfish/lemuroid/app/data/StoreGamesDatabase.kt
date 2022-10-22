package com.swordfish.lemuroid.app.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [StoreGame::class], version = 1)
abstract class StoreGamesDatabase: RoomDatabase() {
    abstract fun storeGameDao():StoreGameDao
}
