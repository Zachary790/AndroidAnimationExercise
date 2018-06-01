package com.engineer.imitate.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.engineer.imitate.R

class SlideListAdapter:RecyclerView.Adapter<SlideListAdapter.MyHolder> {

    private var datas:List<String>

    constructor(datas:List<String>){
        this.datas=datas
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.slide_card_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
    }


    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
         lateinit var imageView: ImageView

        init {
            if (itemView != null) {
                imageView = itemView.findViewById(R.id.image)
            }
        }
    }
}