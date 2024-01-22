package com.neatroots.noteapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neatroots.noteapp.AddActivity
import com.neatroots.noteapp.databinding.RvItemBinding
import com.neatroots.noteapp.models.NoteTable
import java.util.ArrayList

class RvAdapter(var context: Context, var noteList: ArrayList<NoteTable>, var deleteNote:(Int)->Unit) :RecyclerView.Adapter<RvAdapter.MyViewMolder>(){

    inner class MyViewMolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewMolder {
       var binding=RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewMolder(binding)
    }

    override fun getItemCount(): Int {
      return noteList.size
    }

    override fun onBindViewHolder(holder: MyViewMolder, @SuppressLint("RecyclerView") position: Int) {
        holder.binding.note.text=noteList.get(position).data
        holder.itemView.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(v: View?): Boolean {
                deleteNote(position)
                return false
            }

        })
        holder.itemView.setOnClickListener {
            var intent=Intent(context,AddActivity::class.java)
            intent.putExtra("NOTE",noteList.get(position))
            context.startActivity(intent)
        }
    }
}