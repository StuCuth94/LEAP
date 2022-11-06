package com.leap.exampleproject;

import com.leap.exampleproject.application.DefaultBookService;
import com.leap.exampleproject.domain.Book;
import com.leap.exampleproject.infra.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

@SpringBootTest
class BookServiceTest {

    @InjectMocks
    private DefaultBookService systemUnderTest;

    @Mock
    private BookRepository bookRepository;
    
    @Test
    public void serivceShouldInvokeRepoAdd() {
        Book expected = getBook();
        Mockito.when(bookRepository.save(expected)).thenReturn(expected);

        Book actual = systemUnderTest.addBook(expected);

        assertEquals(expected, actual);
        Mockito.verify(bookRepository, times(1)).save(expected);
    }

    @Test
    public void serviceShouldInvokeRepoFetchAll() {
        List<Book> expected = Collections.singletonList(getBook());
        Mockito.when(bookRepository.findAll()).thenReturn(expected);

        List<Book> actual = systemUnderTest.getAll();

        assertEquals(expected, actual);
        Mockito.verify(bookRepository, times(1)).findAll();
    }

    @Test
    public void serviceShouldInvokeRepoFetchById() {
        Book expected = getBook();
        Mockito.when(bookRepository.getReferenceById("ISIN")).thenReturn(expected);

        Book actual = systemUnderTest.getByIsin("ISIN");

        assertEquals(expected, actual);
        Mockito.verify(bookRepository, times(1)).getReferenceById("ISIN");
    }

//    @Test
//    public void serviceShouldInvokeRepoDeleteById() {
//        systemUnderTest.deleteBook("ISIN");
//        Mockito.verify(bookRepository, times(1)).deleteById("ISIN");
//    }

    private Book getBook() {
        return new Book("ISIN", "TITLE", "AUTHOR", 100);
    }
}