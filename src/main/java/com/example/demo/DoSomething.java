package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DoSomething {
    Eat eat;

    public DoSomething (@Qualifier("eat") Eat eat) {
        this.eat = eat;
    }
}
