package com.leap.exampleproject.infra;

import com.leap.exampleproject.application.BookService;
import com.leap.exampleproject.application.DefaultBookService;
import com.leap.exampleproject.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/books")
public class BookController {

    private final BookService bookService;

    public BookController(DefaultBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping(value = "/{isin}")
    public Book getByIsin(@PathVariable String isin) {
        return bookService.getByIsin(isin);
    }

    @PutMapping()
    public Book addBook(@RequestBody Book newBook) {
        return bookService.addBook(newBook);
    }

    @DeleteMapping(value="/{isin}")
    public void deleteBook(@PathVariable String isin) {
        bookService.deleteBook(isin);
    }

}