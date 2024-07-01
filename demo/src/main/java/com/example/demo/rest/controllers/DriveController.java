package com.example.demo.rest.controllers;

import com.example.demo.beans.di.Vehicle;
import com.example.demo.beans.di.impl.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriveController {

    private Vehicle vehicle;

    public DriveController(Vehicle v){
        this.vehicle = v;
    }

    @GetMapping("/drive")
    public String drive(){
        System.out.println((vehicle.drive()));
        return vehicle.toString();
    }

}
