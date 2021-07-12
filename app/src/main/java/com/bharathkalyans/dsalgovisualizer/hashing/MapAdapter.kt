package com.bharathkalyans.dsalgovisualizer.hashing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bharathkalyans.dsalgovisualizer.R

class MapAdapter(private val listOfPairs: MutableList<KeyValuePair>, private val context: Context) :
    RecyclerView.Adapter<MapAdapter.MapViewHolder>() {

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
        holder.hashKey.text = listOfPairs[position].key.toString()
        holder.hashValue.text = listOfPairs[position].value.toString()

    }

    override fun getItemCount(): Int {
        return listOfPairs.size
    }
}

