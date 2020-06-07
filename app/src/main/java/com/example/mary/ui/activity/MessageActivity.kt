package com.example.mary.ui.activity

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mary.R
import com.example.mary.data.FakeData
import com.example.mary.ui.adapter.DialogAdapter
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : BaseActivity(R.layout.activity_message) {

    override val title: String by lazy { getString(R.string.message) }

    private val peopleAdapter = DialogAdapter()
    private val dialogAdapter = DialogAdapter()

    override fun viewCreate() {
        with(rvPeople) {
            adapter = peopleAdapter
            layoutManager =
                LinearLayoutManager(this@MessageActivity, LinearLayoutManager.HORIZONTAL, false)
        }
        peopleAdapter.setList(FakeData.listPeople)

        with(rvDialog) {
            adapter = dialogAdapter
            layoutManager =
                LinearLayoutManager(this@MessageActivity, LinearLayoutManager.HORIZONTAL, false)
        }
        dialogAdapter.setList(FakeData.listDialog)
    }

}
