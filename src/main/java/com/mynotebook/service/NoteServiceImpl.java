package com.mynotebook.service;

import com.mynotebook.model.Note;
import com.mynotebook.repository.NoteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Integer id) {
        return noteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteNote(Integer id) {
        noteRepository.deleteById(id);
    }
}
