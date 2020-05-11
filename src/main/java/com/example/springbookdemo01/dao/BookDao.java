package com.example.springbookdemo01.dao;

import com.example.springbookdemo01.pojo.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public List<Book> findAllBooks();
}
