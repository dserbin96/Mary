package com.example.mary.ui.activity

import android.content.Intent
import android.widget.Toast
import com.example.mary.R
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : BaseActivity(
    layoutId = R.layout.activity_auth,
    enableButtonHome = false
) {

    companion object {
        const val NAME = "NAME"
    }

    override val title: String? by lazy { getString(R.string.auth) }

    /**
     * при вводе 000000 открывается вкладка стажера
     * при вводе 111111 открывается вкладка наставника
     * при вводе 222222 открывается вкладка наставника
     */

    override fun viewCreate() {

        signIn.setOnClickListener {
            when (password.text.toString()) {
                "000000" -> startActivity(
                    Intent(this, StudentActivity::class.java)
                        .apply {
                            putExtra(NAME, login.text)
                        })
                "111111" -> startActivity(Intent(this, AdminActivity::class.java))
                "222222" -> startActivity(Intent(this, Teacher2Activity::class.java))
                else -> Toast.makeText(
                    this,
                    "Непраильно введен логин или пароль",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }

}