package com.example.demo.beans;

import com.example.demo.beans.di.Vehicle;
import com.example.demo.beans.di.impl.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Garage {

    @Bean
    Vehicle v(){
        return new Car();
    }



}
