package com.example.mary.ui.activity

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mary.R
import com.example.mary.data.FakeData
import com.example.mary.ui.adapter.AdaptationAdapter
import kotlinx.android.synthetic.main.activity_adaptation.*

class AdaptationActivity : BaseActivity(R.layout.activity_adaptation) {

    companion object {

        private val MODEL = "MODEL"

        fun getIntent(context: Context, type: Type = Type.READ): Intent =
            Intent(context, AdaptationActivity::class.java)
                .apply {
                    putExtra(MODEL, type)
                }
    }

    override val title: String? by lazy { getString(R.string.adaptation) }

    private val adapter = AdaptationAdapter()

    override fun viewCreate() {
        rvAdaptations.adapter = adapter
        rvAdaptations.layoutManager = LinearLayoutManager(this)

        adapter.setList(FakeData.listAdaptation)

        edit.visibility = if (getModel() == Type.WRITE) View.VISIBLE else View.GONE

        edit.setOnClickListener {
            startActivity(Intent(this, EditActivity::class.java))
        }

    }

    private fun getModel(): Type? = intent?.getSerializableExtra(MODEL) as? Type

    enum class Type {
        READ, WRITE
    }
}
