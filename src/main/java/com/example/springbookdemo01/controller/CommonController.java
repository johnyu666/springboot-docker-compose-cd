package com.example.springbookdemo01.controller;

import com.example.springbookdemo01.dao.BookDao;
import com.example.springbookdemo01.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonController {
    @Autowired
    private BookDao bd;
    @RequestMapping("/login")
    public String login(){
        Book book=new Book();
        book.setBname(("john"));
        bd.addBook(book);
        return "john successful!!";
    }
    @RequestMapping("/books")
    public List<Book> findAllBooks(){
        return  bd.findAllBooks();
    }
}
