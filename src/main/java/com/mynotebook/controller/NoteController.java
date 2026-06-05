package com.mynotebook.controller;

import com.mynotebook.model.Note;
import com.mynotebook.service.NoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note saveNote(@RequestBody Note note) {
        return noteService.saveNote(note);
    }

    @GetMapping
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Integer id) {
        return noteService.getNoteById(id);
    }
    
    @PutMapping("/{id}")
    public Note updateNote(
        @PathVariable Integer id,
        @RequestBody Note note) {

    return noteService.updateNote(id, note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Integer id) {
        noteService.deleteNote(id);
    }
}
