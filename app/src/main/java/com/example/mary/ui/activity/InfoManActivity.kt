package com.example.mary.ui.activity

import android.content.Context
import android.content.Intent
import com.example.mary.R
import com.example.mary.data.InfoMenModel
import kotlinx.android.synthetic.main.activity_info_man.*

class InfoManActivity : BaseActivity(layoutId = R.layout.activity_info_man) {

    companion object {

        private const val INFO_MEN_MODEL = "INFO_MEN_MODEL"

        fun getIntent(context: Context, man: InfoMenModel) =
            Intent(context, InfoManActivity::class.java)
                .apply {
                    putExtra(INFO_MEN_MODEL, man)
                }
    }

    override val title: String by lazy { getModel()?.title.orEmpty() }

    private fun getModel(): InfoMenModel? = intent?.getParcelableExtra(INFO_MEN_MODEL)

    override fun viewCreate() {
        fio.text = getModel()?.name
        phoneNumber.text = getModel()?.homePhone
        workPhoneNumber.text = getModel()?.workPhone
        statusInfo.text = getModel()?.status
        departmentInfo.text = getModel()?.department
    }

}