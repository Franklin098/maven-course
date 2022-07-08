package com.franklin.springcore.springcore;

import com.franklin.springcore.springcore.services.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringcoreApplicationTests {

    @Autowired
    PaymentService service;

    @Test
    void testDependencyInjection() {
        // test if the beans are wired successfully
        assertNotNull(service);
    }

}
