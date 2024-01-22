package com.neatroots.noteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.InvalidationTracker
import com.neatroots.noteapp.adapter.RvAdapter
import com.neatroots.noteapp.databinding.ActivityMainBinding
import com.neatroots.noteapp.models.NoteTable
import com.neatroots.noteapp.viewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    var noteList = ArrayList<NoteTable>()
     var adapter: RvAdapter?=null
    lateinit var mainActivityViewModel: MainActivityViewModel
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.rv.layoutManager = LinearLayoutManager(this)
//         noteList.addAll(mainActivityViewModel.noteList)
        adapter = RvAdapter(this, noteList) {
            deleteNote(it)
        }
        binding.rv.adapter = adapter
        var observer=Observer<List<NoteTable>>{

            noteList.clear()
            noteList.addAll(it)
            if (adapter==null){
                adapter = RvAdapter(this, noteList) {
                    deleteNote(it)
                }

            }else{
                adapter!!.notifyDataSetChanged()
            }

        }
        mainActivityViewModel.noteList.observe(this,observer)

    binding.add.setOnClickListener {
        startActivity(Intent(this@MainActivity,AddActivity::class.java))
    }



    }

    fun deleteNote(position: Int) {
        var note: NoteTable = noteList.get(position)
        mainActivityViewModel.delete(note)
        noteList.removeAt(position)
        adapter!!.notifyItemRemoved(position)
    }
}