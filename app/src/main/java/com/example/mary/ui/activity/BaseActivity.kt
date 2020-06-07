package com.example.mary.ui.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity(
    private val layoutId: Int,
    private val enableButtonHome: Boolean = true
) : AppCompatActivity() {

    open val title: String? = null

    open fun viewCreate() = Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        supportActionBar?.setDisplayHomeAsUpEnabled(enableButtonHome)
        title?.let { setTitle(it) }
        viewCreate()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}