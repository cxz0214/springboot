package com.manning.readinglist;

import com.manning.readinglist.dao.ReadingListRepository;
import com.manning.readinglist.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class readListTest {
    @Autowired
    private Book book;

    @Autowired
    private ReadingListRepository readingListRepository;


    @Test
    public void testSave(){
        Book book = new Book();
        book.setReader("Alex");
        readingListRepository.save(book);
    }
}
