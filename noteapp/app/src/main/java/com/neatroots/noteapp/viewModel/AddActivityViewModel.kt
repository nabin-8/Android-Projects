package com.neatroots.noteapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.neatroots.noteapp.Repo
import com.neatroots.noteapp.models.NoteTable

class AddActivityViewModel( application: Application,  )  : AndroidViewModel(application){

    lateinit var repo : Repo
    init {
        repo= Repo(application)

    }


    fun Insert(note: NoteTable, onSuccess: () -> Unit) {
        repo.insert(note)
        onSuccess()
    }


}