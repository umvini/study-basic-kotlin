package com.umvini.studybasickotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.umvini.studybasickotlin.R

class AdapterItemListActivity(
    private val dataSet: ArrayList<ItemListActivity>,
    private val listener: OnClick
) :
    RecyclerView.Adapter<AdapterItemListActivity.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_activity, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataSet[position]
        holder.tvNameActivity.text = data.nameActivity
        holder.clView.setOnClickListener {
            listener.onItemClick(data.activity)
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNameActivity: TextView
        val clView: ConstraintLayout

        init {
            tvNameActivity = view.findViewById(R.id.tv_name_activity)
            clView = view.findViewById(R.id.cl_view)
        }
    }

    interface OnClick {
        fun onItemClick(activity: Class<*>?)
    }
}