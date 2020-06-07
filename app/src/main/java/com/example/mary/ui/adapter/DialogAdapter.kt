package com.example.mary.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mary.R
import com.example.mary.data.DialogModel
import kotlinx.android.synthetic.main.layout_dialog.view.*

class DialogAdapter : RecyclerView.Adapter<DialogAdapter.DialogViewHolder>() {

    private val mutableList: MutableList<DialogModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DialogViewHolder {
        return DialogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_dialog,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = mutableList.size

    override fun onBindViewHolder(holder: DialogViewHolder, position: Int) {
        holder.bind(mutableList[position])
    }

    fun setList(list: List<DialogModel>) {
        mutableList.clear()
        mutableList.addAll(list)
        notifyDataSetChanged()
    }

    class DialogViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        fun bind(model: DialogModel) {
            with(itemView) {
                Glide.with(context)
                    .load(model.image)
                    .into(image)
                name.text = model.name
            }
        }

    }

}