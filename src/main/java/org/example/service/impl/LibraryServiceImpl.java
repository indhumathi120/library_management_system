package org.example.service.impl;

import org.example.model.Book;
import org.example.service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {

    private static List<Book> bookList = new ArrayList<>();

    @Override
    public Book addBook(Book book) {
        bookList.add(book);
        return bookList.getLast();
        //return bookList.get(bookList.size()-1);
    }

    @Override
    public Book removeBook(Integer bookId) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(bookId)) {
                Book removeedBook = bookList.get(i);
                bookList.remove(bookList.get(i));
                System.out.println("Book removed successfully");
                return removeedBook;
            }
        }

        return null;
    }

    @Override
    public Integer count() {
        return bookList.size();
    }

    @Override
    public Book borrowBook(Integer bookId) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(bookId)) {
                Book book = bookList.get(i);
                book.setAvailable(false);
                return book;
            }
        }
        throw new RuntimeException("No Books available to borrow");

//        return null;
    }

    @Override
    public Book returnBook(Integer bookId) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(bookId)) {
                bookList.get(i).setAvailable(true);
                return bookList.get(i);
            }
        }
        return null;
    }

    @Override
    public void bookList() {
        boolean isAvailable = false;
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).isAvailable()) {
                isAvailable=true;
                System.out.println(bookList.get(i));
            }
        }
        if(!isAvailable){
            System.out.println("No Books available to show");
        }
        else {
            System.out.println("These are the books available");
        }
    }
}