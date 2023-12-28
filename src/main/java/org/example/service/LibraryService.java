package org.example.service;

import org.example.model.Book;

import java.util.List;

public interface LibraryService {
    Book addBook(Book book);
    Book removeBook(Integer bookId);
    Integer count();
    Book borrowBook(Integer bookId);
    Book returnBook(Integer bookId);
    void bookList();
}

