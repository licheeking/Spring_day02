package com.intergraph.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService service = (UserService) context.getBean("userService");
        service.add();
    }
}
