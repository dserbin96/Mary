package com.example.mary.ui.activity

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mary.R
import com.example.mary.data.FakeData
import com.example.mary.ui.adapter.EventAdapter
import kotlinx.android.synthetic.main.activity_event.*

class EventActivity : BaseActivity(R.layout.activity_event) {

    override val title: String by lazy { getString(R.string.events) }

    private val adapter = EventAdapter()

    override fun viewCreate() {
        rvEvents.adapter = adapter
        rvEvents.layoutManager = LinearLayoutManager(this)

        adapter.setList(FakeData.listEvent)
    }
}
