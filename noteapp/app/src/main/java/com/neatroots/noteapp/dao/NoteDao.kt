package com.neatroots.noteapp.dao


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.neatroots.noteapp.models.NoteTable

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note : NoteTable)

    @Update
    fun update(note: NoteTable)
    @Delete
    fun delete(note: NoteTable)

    @Query("SELECT * FROM note_table")
    fun readNotes(): LiveData<List<NoteTable>>

//
//    @Query("SELECT * FROM note_table")
//    fun readNotes(): List<NoteTable>

//    @Delete
//    fun deleteAll()
}