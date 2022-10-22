package com.swordfish.lemuroid.app.data

import com.swordfish.lemuroid.app.api.StoreGameApi
import javax.inject.Inject

class StoreGameRepository @Inject constructor(
    private val api :StoreGameApi,
    private  val db: StoreGamesDatabase
) {
    private val storeGameDao = db.storeGameDao()
    fun getStoreGames()=networkBoundResource(
        query = {
            storeGameDao.getAllStoreGames()
        },
        fetch ={
            api.getStoreGames()
        },
//        saveFetchResult = { restaurants ->
//            db.withTransaction {
//                restaurantDao.deleteAllRestaurants()
//                restaurantDao.insertRestaurants(restaurants)
//            }
//        }
    )
}