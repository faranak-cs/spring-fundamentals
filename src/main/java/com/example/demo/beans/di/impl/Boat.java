package com.example.demo.beans.di.impl;

import com.example.demo.beans.di.Vehicle;
import jakarta.annotation.PostConstruct;

public class Boat implements Vehicle {

    @PostConstruct
        public void init() {
            System.out.println("Boat init");
        }

    private final String color;

    public Boat(String color) {
        this.color = color;
    }

    @Override
    public String drive() {
        return "I am driving a " + color + " boat";
    }

    @Override
    public String toString() {
        return color + " boat";
    }
}
