package com.neatroots.noteapp.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.Date

@Entity(tableName = "note_table")
class NoteTable (

    @PrimaryKey(autoGenerate = true) val key: Int? =null,
    @ColumnInfo(name = "data") val data:String,
    @ColumnInfo(name = "color_code") val color_code:Int

    // @ColumnInfo(name = "date") val date:Date?=null

):Serializable{

}