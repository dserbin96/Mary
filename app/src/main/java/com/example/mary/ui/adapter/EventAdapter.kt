package com.example.mary.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mary.R
import com.example.mary.data.EventModel
import kotlinx.android.synthetic.main.layout_event.view.*

class EventAdapter : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    private val mutableList: MutableList<EventModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_event,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = mutableList.size

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(mutableList[position])
    }

    fun setList(list: List<EventModel>) {
        mutableList.clear()
        mutableList.addAll(list)
        notifyDataSetChanged()
    }

    class EventViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        fun bind(model: EventModel) {
            with(itemView) {
                date.text = model.data
                title.text = model.name
            }
        }

    }

}