package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication // Scans our project for spring components and autowires most of spring libraries.
public class App
{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
}
