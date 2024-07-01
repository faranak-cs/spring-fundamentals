package com.example.demo.beans.di.impl;

import com.example.demo.beans.di.Vehicle;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @PostConstruct
    public void init() {
        System.out.println("Car init");
    }

    private final String color;

    public Car() {
        this.color = "blue";
    }

    @Override
    public String drive() {
        return "I am driving a " + color + " car";
    }

    @Override
    public String toString() {
        return color + " car";
    }
}
