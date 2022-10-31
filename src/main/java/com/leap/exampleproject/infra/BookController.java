package com.leap.exampleproject.infra;

import com.leap.exampleproject.application.Library;
import com.leap.exampleproject.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/books")
public class BookController {

    private final Library library;

    public BookController(Library library) {
        this.library = library;
    }

    @GetMapping(value = "/all")
    public List<Book> getAll() {
        return library.getAll();
    }

    @PutMapping()
    public Book addBook(@RequestBody Book newBook) {
        return library.addBook(newBook);
    }

}