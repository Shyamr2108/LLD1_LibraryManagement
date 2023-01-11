package com.masai.Utils;

import com.masai.Bean.Book;

import java.util.HashMap;

public class Library {

    HashMap<Integer, Book> books;
    public Library() {
        books = new HashMap<Integer, Book>();
    }

    public boolean addBook(Book book){
        if(books.containsKey(book.getBookId())){
            System.out.println("Book already there");
            return false;
        }
       books.put(book.getBookId(), book);

        return true;
    }
    public boolean removeBook(int id){
        if(!books.containsKey(id)){
            System.out.println("Book is not there");
            return false;
        }
        books.remove(id);
        return true;

    }

    public Book findBook(int id){
        if(!books.containsKey(id)){
            System.out.println("Book is not there");
            return null;
        }
        return books.get(id);

    }
}
