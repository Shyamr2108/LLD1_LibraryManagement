package com.masai.Bean;

import java.util.Objects;

public class Book {

    //- bookId : int, title : String, details : String

    private int bookId;
    private String title;
    private String details;

    private int noOfPages;


    public Book() {
    }

    public Book(int bookId, String title, String details,int noOfPages) {
        this.bookId = bookId;
        this.title = title;
        this.details = details;
        this.noOfPages=noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ",noOfPages"+noOfPages+ '\''+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && noOfPages == book.noOfPages && Objects.equals(title, book.title) && Objects.equals(details, book.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, details, noOfPages);
    }
}
