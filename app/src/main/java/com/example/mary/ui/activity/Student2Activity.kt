package com.example.mary.ui.activity

import android.content.Context
import android.content.Intent
import com.example.mary.R
import com.example.mary.data.FakeData
import com.example.mary.data.InfoMenModel
import kotlinx.android.synthetic.main.activity_student2.*

class Student2Activity : BaseActivity(R.layout.activity_student2) {

    companion object {

        private const val MODEL = "MODEL"

        fun getIntent(context: Context, model: InfoMenModel) =
            Intent(context, Student2Activity::class.java)
                .apply {
                    putExtra(MODEL, model)
                }

    }

    override val title: String by lazy {
        getModel()?.name.orEmpty()
    }

    override fun viewCreate() {

        adaptation.setOnClickListener {
            startActivity( AdaptationActivity.getIntent(this))
        }

        info.setOnClickListener {
            startActivity(InfoManActivity.getIntent(this, getModel()))
        }

        teacher.setOnClickListener {
            startActivity(InfoManActivity.getIntent(this, FakeData.teacher))
        }

        director.setOnClickListener {
            startActivity(InfoManActivity.getIntent(this, FakeData.director))
        }

    }

    private fun getModel() = intent.getParcelableExtra<InfoMenModel>(MODEL)

}
