package com.example.mary.ui.activity

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mary.R
import com.example.mary.ui.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_teacher.*

class TeacherActivity : BaseActivity(R.layout.activity_teacher) {

    override val title: String by lazy { getString(R.string.teachers) }

    override fun viewCreate() {
        rvTeachers.layoutManager = LinearLayoutManager(this)
    }
}
