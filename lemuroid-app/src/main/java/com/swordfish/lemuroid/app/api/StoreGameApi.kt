package com.swordfish.lemuroid.app.api

import com.swordfish.lemuroid.app.data.StoreGame
import retrofit2.http.GET

interface StoreGameApi {

    companion object {
        const val BASE_URL = "https://random-data-api.com/api/"
    }

    @GET("restaurant/random_restaurant?size=20")
    suspend fun getStoreGames(): List<StoreGame>
}
