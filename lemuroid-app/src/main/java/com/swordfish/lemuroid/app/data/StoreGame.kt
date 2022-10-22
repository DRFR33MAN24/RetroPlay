package com.swordfish.lemuroid.app.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "storegames")
data class StoreGame (
    @PrimaryKey
    val name: String,
    val link: String,
    val cover:String
)
