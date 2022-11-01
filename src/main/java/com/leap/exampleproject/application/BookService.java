package com.leap.exampleproject.application;

import com.leap.exampleproject.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book getByIsin(String isin);

    Book addBook(Book newBook);

    void deleteBook(String isin);

}