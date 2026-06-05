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
    
    @Override
    public Note updateNote(Integer id, Note note) {

    Note existingNote =
            noteRepository.findById(id).orElse(null);

    if (existingNote != null) {

        existingNote.setTitle(note.getTitle());
        existingNote.setContent(note.getContent());
        existingNote.setPageNumber(note.getPageNumber());
        existingNote.setShowInContent(note.getShowInContent());
        existingNote.setNotebook(note.getNotebook());

        return noteRepository.save(existingNote);
    }

    return null;
    }
}
