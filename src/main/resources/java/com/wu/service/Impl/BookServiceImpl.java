package com.wu.service.Impl;

import com.wu.mapper.BookMapper;
import com.wu.pojo.Book;
import com.wu.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }


}
