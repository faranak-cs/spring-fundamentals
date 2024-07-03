package com.example.demo.beans;

import com.example.demo.beans.di.Vehicle;
import com.example.demo.beans.di.impl.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Garage {

    //
    // INJECTOR CLASS
    // 1. INJECTOR USES CLIENT CONSTRUCTOR TO PASS DEPENDENCY (CONSTRUCTOR)
    // 2. INJECTOR USES PUBLIC PROPERTY TO PASS DEPENDENCY (SETTER)
    // 3. CLIENT IMPLEMENTS AN INTERFACE METHOD TO RECEIVE DEPENDENCY (INTERFACE)
    //

    // INSTANTIATE OBJECT OF VEHICLE INTERFACE
    @Bean
    Vehicle v(){
        // USING CONSTRUCTOR
        return new Car();
    }

}
