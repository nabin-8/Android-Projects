package com.neatroots.noteapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.neatroots.noteapp.Repo
import com.neatroots.noteapp.models.NoteTable


class MainActivityViewModel( application: Application) : AndroidViewModel(application) {

     lateinit var noteList:LiveData<List<NoteTable>>
//     lateinit var noteList:List<NoteTable>
     lateinit var repo :Repo
     init {
         repo=Repo(application)
         noteList=repo.readNotes()
     }
    fun delete(note: NoteTable){
        repo.delete(note)
    }



}