package com.bharathkalyans.dsalgovisualizer.hashing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bharathkalyans.dsalgovisualizer.R

class MapAdapter() :
    RecyclerView.Adapter<MapAdapter.MapViewHolder>() {

    private var listOFPairs: MutableList<KeyValuePair> = mutableListOf()

    inner class MapViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hashKey: TextView = itemView.findViewById(R.id.tvHashKey)
        val hashValue: TextView = itemView.findViewById(R.id.tvHashValue)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MapViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.map_element_view, parent, false)

        return MapViewHolder(view)
    }

    override fun onBindViewHolder(holder: MapViewHolder, position: Int) {
        holder.hashKey.text = listOFPairs[position].key.toString()
        holder.hashValue.text = listOFPairs[position].value.toString()

    }

    override fun getItemCount(): Int {
        return listOFPairs.size
    }

    fun updateData(newList: MutableList<KeyValuePair>) {
        listOFPairs = newList
        notifyDataSetChanged()
    }

}

