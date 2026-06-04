package com.mynotebook.controller;

import com.mynotebook.model.Notebook;
import com.mynotebook.service.NotebookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notebooks")
public class NotebookController {

    @Autowired
    private NotebookService notebookService;

    @PostMapping
    public Notebook saveNotebook(@RequestBody Notebook notebook) {
        return notebookService.saveNotebook(notebook);
    }

    @GetMapping
    public List<Notebook> getNotebooks() {
        return notebookService.getNotebooks();
    }

    @GetMapping("/{id}")
    public Notebook getNotebookById(@PathVariable Integer id) {
        return notebookService.getNotebookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteNotebook(@PathVariable Integer id) {
        notebookService.deleteNotebook(id);
    }
}
