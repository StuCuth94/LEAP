package com.leap.exampleproject.application;

import com.leap.exampleproject.domain.Book;
import com.leap.exampleproject.infra.BookRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Library {

    private final BookRepository bookRepository;

    public Library(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    public Book addBook(Book newBook) {
        return bookRepository.save(newBook);
    }

}