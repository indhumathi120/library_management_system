package org.example.model;

public class Book {
    private Integer id;
    private String section;
    private String title;
    private String author;
    private boolean isAvailable ;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", section='" + section + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Book(Integer id, String section, String title, String author, boolean isAvailable) {
        this.id = id;
        this.section = section;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public Book(){}
}
