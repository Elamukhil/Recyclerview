package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView


class MyListAdapter(private val listdata: List<MyListData>) :
    RecyclerView.Adapter<MyListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val myListData = listdata[position]
        var text:String=myListData.description
        holder.textView.text = listdata[position].description
        holder.imageView.setImageResource(listdata[position].imgId)
        holder.relativeLayout.setOnClickListener { view ->
            var intent = Intent(view.context, MainActivity2::class.java)
            intent.putExtra("message_key", myListData.description)
            view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textView: TextView
        var relativeLayout: RelativeLayout

        init {
            imageView = itemView.findViewById<View>(R.id.imageView) as ImageView
            textView = itemView.findViewById<View>(R.id.textView) as TextView
            relativeLayout = itemView.findViewById<View>(R.id.relativeLayout) as RelativeLayout
        }
    }
}
