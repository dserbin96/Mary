package com.example.mary.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mary.R
import kotlinx.android.synthetic.main.activity_teacher2.*

class Teacher2Activity : BaseActivity(R.layout.activity_teacher2) {

    override val title: String by lazy { getString(R.string.teacher) }

    override fun viewCreate() {

        students.setOnClickListener {
            startActivity(PeopleActivity.getIntent(this, PeopleActivity.Type.STUDENT2))
        }

        events.setOnClickListener {
            startActivity(Intent(this, EventActivity::class.java))
        }

        message.setOnClickListener {
            startActivity(Intent(this, MessageActivity::class.java))
        }

    }

}
