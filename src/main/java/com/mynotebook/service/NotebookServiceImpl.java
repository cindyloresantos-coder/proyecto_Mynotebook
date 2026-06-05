
package com.mynotebook.service;

import com.mynotebook.model.Notebook;
import com.mynotebook.repository.NotebookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotebookServiceImpl implements NotebookService {
    
    @Autowired 
    private NotebookRepository
        notebookRepository;

    @Override
    public Notebook saveNotebook (Notebook notebook) {
        return
        notebookRepository.save(notebook);
    }
    
    @Override
    public List<Notebook> getNotebooks() {
        return
        notebookRepository.findAll();
    }
    
    @Override
    public Notebook getNotebookById(Integer id) {
        return 
        notebookRepository.findById(id).orElse(null);
    }
    
    @Override
    public void deleteNotebook(Integer id) {
        notebookRepository.deleteById(id);
    }
    
    @Override
    public Notebook updateNotebook(Integer id, Notebook notebook) {

    Notebook existingNotebook =
            notebookRepository.findById(id).orElse(null);

    if (existingNotebook != null) {

        existingNotebook.setSubject(notebook.getSubject());
        existingNotebook.setCoverImage(notebook.getCoverImage());
        existingNotebook.setDescription(notebook.getDescription());
        existingNotebook.setTeacher(notebook.getTeacher());
        existingNotebook.setUser(notebook.getUser());

        return notebookRepository.save(existingNotebook);
    }

    return null;
    }
}
