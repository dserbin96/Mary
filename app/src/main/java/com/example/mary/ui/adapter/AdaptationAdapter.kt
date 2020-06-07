package com.example.mary.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mary.R
import com.example.mary.data.AdaptationModel
import kotlinx.android.synthetic.main.layout_adaptation.view.*

class AdaptationAdapter : RecyclerView.Adapter<AdaptationAdapter.AdaptationViewHolder>() {

    private val mutableList: MutableList<AdaptationModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptationViewHolder {
        return AdaptationViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_adaptation,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = mutableList.size

    override fun onBindViewHolder(holder: AdaptationViewHolder, position: Int) {
        holder.bind(mutableList[position])
    }

    fun setList(list: List<AdaptationModel>) {
        mutableList.clear()
        mutableList.addAll(list)
        notifyDataSetChanged()
    }

    class AdaptationViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        fun bind(model: AdaptationModel) {
            with(itemView) {
                date.text = model.date
                title.text = model.title
                count.text = model.count
            }
        }

    }

}