package com.intergraph.xmlanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.add();
    }

}
