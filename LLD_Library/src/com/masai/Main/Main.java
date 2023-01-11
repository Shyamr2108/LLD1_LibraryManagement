package com.masai.Main;

import com.masai.Bean.Book;
import com.masai.Bean.User;
import com.masai.System.ReaderSystem;

public class Main {

    public static void main(String[] args) {


    ReaderSystem readerSystem = new ReaderSystem();

    Book book = new Book(1, "gita", "song sung by lord krishna", 108);
    User user = new User(1, "lal");

    User user2 = new User(2, "rohan");
    readerSystem.getUserManager().addUser(user);
    readerSystem.setUser(user2);
    readerSystem.setBook(book);
    readerSystem.getDisplay();
    readerSystem.getDisplay().nextPage();
    readerSystem.getDisplay().refreshPage();


    System.out.println(book);
}


}
