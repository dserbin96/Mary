package com.example.mary.ui.activity

import android.content.Intent
import com.example.mary.R
import com.example.mary.data.FakeData
import kotlinx.android.synthetic.main.activity_student.*

class StudentActivity : BaseActivity(layoutId = R.layout.activity_student) {

    override val title: String by lazy { getString(R.string.app_name) }

    override fun viewCreate() {
        supportActionBar?.title = intent?.getCharSequenceExtra(AuthActivity.NAME)

        adaptation.setOnClickListener {
            startActivity(AdaptationActivity.getIntent(this))
        }

        event.setOnClickListener {
            startActivity(Intent(this, EventActivity::class.java))
        }

        teacher.setOnClickListener {
            startActivity(InfoManActivity.getIntent(this, FakeData.teacher))
        }

        manager.setOnClickListener {
            startActivity(InfoManActivity.getIntent(this, FakeData.hr))
        }
        message.setOnClickListener {
            startActivity(Intent(this, MessageActivity::class.java))
        }

    }

}
