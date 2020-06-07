package com.example.mary.ui.activity

import android.content.Intent
import com.example.mary.R
import kotlinx.android.synthetic.main.activity_admin.*

class AdminActivity : BaseActivity(R.layout.activity_admin) {

    override val title: String by lazy { getString(R.string.students) }

    override fun viewCreate() {

        students.setOnClickListener {
            startActivity(PeopleActivity.getIntent(this, PeopleActivity.Type.STUDENT))
        }

        teachers.setOnClickListener {
            startActivity(PeopleActivity.getIntent(this, PeopleActivity.Type.TEACHER))
        }

        events.setOnClickListener {
            startActivity(Intent(this, EventActivity::class.java))
        }

        message.setOnClickListener {
            startActivity(Intent(this, MessageActivity::class.java))
        }

    }
}
