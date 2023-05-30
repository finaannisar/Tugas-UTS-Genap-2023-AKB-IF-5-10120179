package com.finaannisar10120179.noters10120179;
//10120179
//Fina Annisa Rahmasari
//IF 5
import android.database.Cursor;

import com.finaannisar10120179.noters10120179.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

