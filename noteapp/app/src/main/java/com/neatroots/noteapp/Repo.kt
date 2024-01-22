package com.neatroots.noteapp

import android.content.Context
import androidx.lifecycle.LiveData
import com.neatroots.noteapp.dao.NoteDao
import com.neatroots.noteapp.database.DatabaseBuilder
import com.neatroots.noteapp.models.NoteTable

class Repo(var context: Context) {
   var daoObject:NoteDao= DatabaseBuilder.getDatabase(context).getNoteDao()

//    fun readNotes(): List<NoteTable>{
//        return daoObject.readNotes()
//    }
    fun readNotes(): LiveData<List<NoteTable>>{
        return daoObject.readNotes()
    }
    fun insert(note :NoteTable){
        daoObject.insert(note)
    }
    fun update(note: NoteTable){
        daoObject.update(note)
    }
    fun delete(note: NoteTable){
        daoObject.delete(note)
    }

}