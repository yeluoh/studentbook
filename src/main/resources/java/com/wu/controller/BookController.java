package com.wu.controller;

import com.wu.pojo.Book;
import com.wu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allbook")
    public String list(Model model){
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allbook";
    }

}
