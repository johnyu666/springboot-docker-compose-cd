package com.example.springbookdemo01.dao;

import com.example.springbookdemo01.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate template;
    @Override
    public void addBook(Book book) {
        String sql="insert into books (bname) values (?)";
        template.update(sql,new Object[]{book.getBname()});

    }

    @Override
    public List<Book> findAllBooks() {
        String sql="select * from books";
       List<Book> books= template.query(sql, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book=new Book();
                book.setId(resultSet.getInt("id"));
                book.setBname(resultSet.getString("bname"));
                return book;
            }
        });
        return books;
    }
}
