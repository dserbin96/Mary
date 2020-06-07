package com.example.mary.ui.activity

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mary.R
import com.example.mary.data.FakeData
import com.example.mary.ui.adapter.PeopleAdapter
import kotlinx.android.synthetic.main.activity_people.*

class PeopleActivity : BaseActivity(R.layout.activity_people) {

    companion object {

        private const val TYPE = "TYPE"

        fun getIntent(context: Context, type: Type) =
            Intent(context, PeopleActivity::class.java)
                .apply {
                    putExtra(TYPE, type)
                }
    }

    lateinit var adapter: PeopleAdapter

    override fun viewCreate() {
        rvPeople.layoutManager = LinearLayoutManager(this)
        when(getType()){
            Type.STUDENT->{
                adapter = PeopleAdapter {
                    startActivity(Student2Activity.getIntent(this, it))
                }
                adapter.list = FakeData.listStudents
            }
            Type.TEACHER->{
                adapter = PeopleAdapter()
                adapter.list = FakeData.listTeachers
            }
            Type.STUDENT2->{
                adapter = PeopleAdapter {
                    startActivity(Student3Activity.getIntent(this, it))
                }
                adapter.list = FakeData.listStudents
            }
        }
        rvPeople.adapter = adapter
    }

    private fun getType(): Type = intent?.getSerializableExtra(TYPE) as Type

    enum class Type {
        STUDENT,STUDENT2, TEACHER
    }
}
