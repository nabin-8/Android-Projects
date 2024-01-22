package com.neatroots.noteapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.neatroots.noteapp.dao.NoteDao
import com.neatroots.noteapp.models.NoteTable

@Database(entities = arrayOf(NoteTable::class), exportSchema = false, version = 3)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun getNoteDao(): NoteDao


}