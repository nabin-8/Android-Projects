package com.example.recycleview_practice

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview_practice.databinding.RvItemBinding

class CustomAdapter(var dataList:ArrayList<model>, var context: Context) :RecyclerView.Adapter<CustomAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding=RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(dataList.get(position).img)
        holder.binding.textView.text=dataList.get(position).disp
        holder.itemView.setOnClickListener {
            Toast.makeText(context, dataList.get(position).disp, Toast.LENGTH_SHORT).show()
        }
    }

    inner class ViewHolder (var binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

}