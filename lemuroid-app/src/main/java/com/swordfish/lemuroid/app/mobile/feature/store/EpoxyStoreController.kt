package com.swordfish.lemuroid.app.mobile.feature.store

import com.airbnb.epoxy.AsyncEpoxyController
import com.swordfish.lemuroid.R
import com.swordfish.lemuroid.app.mobile.feature.home.HomeViewModel


class EpoxyStoreController():AsyncEpoxyController() {

    private var uiState = StoreViewModel.UIState()

    fun update(viewState: StoreViewModel.UIState) {
        uiState = viewState
        requestModelBuild()
    }
    override fun buildModels() {

    }
}
