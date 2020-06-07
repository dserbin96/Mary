package com.example.mary.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mary.R
import com.example.mary.data.InfoMenModel
import kotlinx.android.synthetic.main.layout_people.view.*

class PeopleAdapter(private var listener: ((InfoMenModel) -> Unit)? = null) :
    RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {

    var list = mutableListOf<InfoMenModel>()
        set(value) {
            field.clear()
            field.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder =
        PeopleViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_people,
                parent,
                false
            )
        )


    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class PeopleViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(model: InfoMenModel) {
            itemView.fio.text = model.name
            itemView.setOnClickListener {
                listener?.invoke(model)
            }
        }

    }

}