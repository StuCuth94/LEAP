package com.leap.exampleproject.application;

import com.leap.exampleproject.domain.Book;
import com.leap.exampleproject.infra.BookRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultBookService implements BookService {

    private final BookRepository bookRepository;

    public DefaultBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getByIsin(String isin) {
        return bookRepository.getReferenceById(isin);
    }

    @Override
    public Book addBook(Book newBook) {
        return bookRepository.save(newBook);
    }

    @Override
    public void deleteBook(String isin) {
//        bookRepository.deleteById(isin);
    }

}