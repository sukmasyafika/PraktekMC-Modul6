package com.example.modul6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val namaList : List<Item>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder (itemData: View) : RecyclerView.ViewHolder (itemData) {
        val gambar: ImageView = itemData.findViewById(R.id.imageView)
        val nama: TextView = itemData.findViewById(R.id.Nama)
        val telp: TextView = itemData.findViewById(R.id.Phone)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        val itemData = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemData)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.img)
        holder.nama.text = currentItem.nama
        holder.telp.text = currentItem.telp

    }
}