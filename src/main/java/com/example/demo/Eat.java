package com.example.demo;

import org.springframework.stereotype.Component;

@Component("eat")
public class Eat {
    public Eat() {
        System.out.println("Eating...");
    }
}
