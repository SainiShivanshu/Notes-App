package com.example.notesapp.dao

import androidx.room.*
import com.example.notesapp.entities.Notes


@Dao
interface NotesDao {
    @get:Query("SELECT * from notes ORDER BY id DESC")
    val allnotes :List<Notes>

@Insert(onConflict = OnConflictStrategy.REPLACE)

fun insertNotes(notes:Notes)

@Delete
fun deleteNote(note:Notes)
}