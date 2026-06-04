
package com.mynotebook.repository;

import com.mynotebook.model.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer> {
    
}
