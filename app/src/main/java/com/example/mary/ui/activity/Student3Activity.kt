package com.example.mary.ui.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mary.R
import com.example.mary.data.FakeData
import com.example.mary.data.InfoMenModel
import kotlinx.android.synthetic.main.activity_student3.*

class Student3Activity : BaseActivity(R.layout.activity_student3) {

    companion object {

        private val MODEL = "MODEL"

        fun getIntent(context: Context, menModel: InfoMenModel) =
            Intent(context, Student3Activity::class.java)
                .apply {
                    putExtra(MODEL, menModel)
                }
    }

    override val title: String by lazy { getModel()?.name.orEmpty() }

    override fun viewCreate() {
        adaptation.setOnClickListener {
            startActivity(AdaptationActivity.getIntent(this, AdaptationActivity.Type.WRITE))
        }
        info.setOnClickListener {
            getModel()?.also { startActivity(InfoManActivity.getIntent(this, it)) }
        }
        hr.setOnClickListener {
            startActivity(InfoManActivity.getIntent(this, FakeData.hr))
        }
    }

    private fun getModel(): InfoMenModel? = intent.getParcelableExtra(MODEL)

}
