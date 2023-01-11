package com.masai.System;

import com.masai.Bean.Book;
import com.masai.Bean.User;
import com.masai.Dashboard.Dashboard;
import com.masai.Utils.Library;
import com.masai.Utils.UserManager;

public class ReaderSystem {

    private Library library;
    private UserManager userManager;
    private Dashboard display;

    public ReaderSystem() {
        library = new Library();
        userManager = new UserManager();
        display = new Dashboard();
    }

    public Book getBook(int bookId) {
        return library.findBook(bookId);
    }

    public User getUser(int userId) {
        return userManager.findUser(userId);
    }

    public void setBook(Book book) {
        display.setBook(book);
    }

    public void setUser(User user) {
        display.setUser(user);
    }

    public Dashboard getDisplay() {
        return display;
    }
    public UserManager getUserManager() {
        return userManager;
    }
}
