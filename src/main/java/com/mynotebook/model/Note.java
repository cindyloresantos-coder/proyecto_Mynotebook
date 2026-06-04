package com.mynotebook.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", length = 200)
    private String title;

    @Column(name = "content", columnDefinition = "LONGTEXT")
    private String content;

    @Column(name = "page_number")
    private Integer pageNumber;

    @Column(name = "show_in_content")
    private Boolean showInContent;

    @ManyToOne
    @JoinColumn(name = "notebook_id")
    private Notebook notebook;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Note() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Boolean getShowInContent() {
        return showInContent;
    }

    public void setShowInContent(Boolean showInContent) {
        this.showInContent = showInContent;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    
}
