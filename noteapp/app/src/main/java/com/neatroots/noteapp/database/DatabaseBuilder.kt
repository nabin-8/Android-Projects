package com.neatroots.noteapp.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

object DatabaseBuilder {
    private var INSTANCE: NoteDatabase? = null


    @Synchronized
    fun getDatabase(context: Context): NoteDatabase {
        // if database is not crate then will create and return other if create will directly return
        if (INSTANCE == null) {


                INSTANCE = Room.databaseBuilder(
                    context, NoteDatabase::class.java, "note_database.db"
                ).allowMainThreadQueries().setJournalMode(RoomDatabase.JournalMode.TRUNCATE).fallbackToDestructiveMigration().build()

        }

        return INSTANCE!!

    }

}