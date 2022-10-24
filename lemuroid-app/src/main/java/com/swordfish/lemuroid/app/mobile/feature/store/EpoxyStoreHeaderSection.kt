package com.swordfish.lemuroid.app.mobile.feature.store

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.swordfish.lemuroid.R


@EpoxyModelClass(layout=R.layout.layout_store_header_section)
abstract class  EpoxyStoreHeaderSection: EpoxyModelWithHolder<EpoxyStoreHeaderSection.Holder>(){

    @EpoxyAttribute
    var title: Int? = null

    override fun bind(holder: Holder) {
        title?.let {
            holder.titleView.setText(it)
        }
    }

    class Holder : EpoxyHolder() {
        lateinit var titleView: TextView

        override fun bindView(itemView: View) {
            titleView = itemView.findViewById(R.id.text)
        }
    }
}
