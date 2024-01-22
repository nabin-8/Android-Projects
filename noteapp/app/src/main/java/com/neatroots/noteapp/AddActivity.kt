package com.neatroots.noteapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.neatroots.noteapp.databinding.ActivityAddBinding
import com.neatroots.noteapp.models.NoteTable
import com.neatroots.noteapp.viewModel.AddActivityViewModel
import kotlin.random.Random

class AddActivity : AppCompatActivity() {
    lateinit var addActivityViewModel: AddActivityViewModel
    private lateinit var binding: ActivityAddBinding
    lateinit var noteTable: NoteTable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addActivityViewModel = ViewModelProvider(this).get(AddActivityViewModel::class.java)

        setSupportActionBar(findViewById(R.id.toolbar))
        if (intent.hasExtra("NOTE")){
            noteTable= intent.getSerializableExtra("NOTE") as NoteTable
            binding.content.note?.setText(noteTable.data)

        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.right_menu, menu)
        menuInflater.inflate(R.menu.menu_add, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.save -> {

                noteTable = NoteTable(
                    data = binding.content.note?.text.toString(),
                    color_code = Random.nextInt(6)
                )
                addActivityViewModel.Insert(noteTable) {
                    finish()
                }
            }

        }

        return super.onOptionsItemSelected(item)
    }

}