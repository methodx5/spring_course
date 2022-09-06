package com.javadev.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Head First Java")
    private String name;

    public String getName() {
        return name;
    }
}
