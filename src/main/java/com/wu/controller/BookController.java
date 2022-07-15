package com.wu.controller;

import com.wu.pojo.Book;
import com.wu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
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
    //增加书籍页面
    @RequestMapping("/toAddbook")
    public String toAddPager(){
        return "addbook";
    }
    //添加书籍
    @RequestMapping("/addbook")
    public String addbook(Book book){
        System.out.println("addbook=>"+book);
        bookService.addBook(book);
        return "redirect:/book/allbook";//重定向到我们的@RequestMapping("/allbook")请求
    }
    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePager(int id,Model model){
        Book book = bookService.queryBookById(id);
        model.addAttribute("QBook",book);

        return "updatebook";
    }
    //修改书籍
    @RequestMapping("/updatebook")
    public String updatebook(Book book){
        System.out.println("updatebook=>"+book);
        bookService.updateBook(book);
        return "redirect:/book/allbook";
    }
    //删除书籍
    @RequestMapping("/deletebook/{id}")
    public String deletebook(@PathVariable("id") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allbook";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Book book = bookService.queryBookByName(queryBookName);
        List<Book> list = new ArrayList<Book>();
        list.add(book);
        if (book == null){
            list = bookService.queryAllBook();
            model.addAttribute("error","查询失败");
        }
        model.addAttribute("list",list);
        return "allbook";

    }
    //跳转购买书籍
    @RequestMapping("/toBuybook")
    public String toBuybook(int id,Model model){
        Book book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "buybook";
    }
    //购买书籍
    @RequestMapping("/buybook")
    public String buybook(Book book){
        bookService.updateBook(book);
        return "redirect:/book/allbook";
    }
}
