package com.mynotebook.service;

import com.mynotebook.model.Note;
import java.util.List;

public interface NoteService {

    Note saveNote(Note note);

    List<Note> getNotes();

    Note getNoteById(Integer id);

    void deleteNote(Integer id);
}
