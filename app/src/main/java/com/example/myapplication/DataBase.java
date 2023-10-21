package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private ArrayList<Book> books = new ArrayList<>();
    public DataBase(){
        books.add(new Book("pro book","ashraf","pro books"));
        books.add(new Book("data book","ashraf","Data books"));
        books.add(new Book("math book","ashraf","math books"));
    }
    public List<Book> getBooks(String cat){
        ArrayList<Book> result = new ArrayList<>();
        for (Book b: books){
            if(b.getCategory().equals(cat))
                result.add(b);
        }
        return result;

    }

}
