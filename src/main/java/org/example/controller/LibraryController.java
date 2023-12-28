package org.example.controller;

import org.example.model.Book;
import org.example.service.LibraryService;
import org.example.service.impl.LibraryServiceImpl;

import java.util.Scanner;

public class LibraryController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" 1.Add a new Book\n 2.Remove a Book\n 3.Total Count\n 4.Borrow a Book\n 5.Return a Book\n 6.List all books");
            System.out.println("Enter your choice:");
            //decisions (1? 2? ....5?)
            int choice = scanner.nextInt();
            choiceMaker(choice);
        }
    }
    static private void choiceMaker(Integer choice){
        LibraryService libraryService = new LibraryServiceImpl();
        Scanner scanner = new Scanner(System.in);
        if(choice==1){
            Book book = new Book();     //creating new book
            System.out.println("Enter bookId:");
            int id = scanner.nextInt();
            book.setId(id);
            scanner.nextLine();
            System.out.println("Enter bookTitle:");
            String title=scanner.nextLine();
            book.setTitle(title);
            System.out.println("Enter bookSection:");
            String section=scanner.nextLine();
            book.setSection(section);
            boolean setavailable = true;
            book.setAvailable(setavailable);
            System.out.println("Enter bookAuthor:");
            String author=scanner.nextLine();
            book.setAuthor(author);
            System.out.println(libraryService.addBook(book).toString());
        }
        else if(choice == 2){
            System.out.println("Enter the bookId to remove:");
            int removeId = scanner.nextInt();
            System.out.println(libraryService.removeBook(removeId));
        } else if (choice == 3) {
            System.out.println("Total Count is:"+libraryService.count());
//            int borrowId= scanner.nextInt();

        }
        else if (choice == 4){
            System.out.println("Enter the bookId to borrow:");
           int borrowId = scanner.nextInt();
            System.out.println(libraryService.borrowBook(borrowId));
        } else if (choice == 5) {
            System.out.println("Enter the bookId to return:");
            int returnId = scanner.nextInt();
            System.out.println(libraryService.returnBook(returnId));
        }else if (choice == 6){
            libraryService.bookList();
        }
        else {
            System.exit(0);
        }

    }

}
