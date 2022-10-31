package com.leap.exampleproject;

import com.leap.exampleproject.application.Library;
import com.leap.exampleproject.infra.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryTest {

    private Library systemUnderTest;

    @Mock
    private BookRepository bookRepository;
    
    @Test
    public void libraryShouldInvokeRepoCallOnAdd() {
        Mockito.when(bookRepository.save())
    }
}