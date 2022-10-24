package com.swordfish.lemuroid.app.mobile.feature.store

import androidx.lifecycle.ViewModel
import com.swordfish.lemuroid.app.mobile.feature.home.HomeViewModel
import com.swordfish.lemuroid.lib.library.db.entity.Game
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class StoreViewModel():ViewModel() {


    private val uiStates = MutableStateFlow(StoreViewModel.UIState())

    fun getViewStates(): Flow<StoreViewModel.UIState> {
        return uiStates
    }
    data class UIState(
        val favoritesGames: List<Game> = emptyList(),
        val recentGames: List<Game> = emptyList(),
        val discoveryGames: List<Game> = emptyList(),
        val indexInProgress: Boolean = false,
        val loading: Boolean = true
    )
}
