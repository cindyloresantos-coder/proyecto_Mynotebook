
package com.mynotebook.service;

import com.mynotebook.model.Notebook;
import java.util.List;

public interface NotebookService {
    
    Notebook saveNotebook(Notebook notebook);
    
    List<Notebook> getNotebooks();
    
    Notebook getNotebookById(Integer id);
    
    void deleteNotebook(Integer id);
    
    Notebook updateNotebook(Integer id, Notebook notebook);
    
}
