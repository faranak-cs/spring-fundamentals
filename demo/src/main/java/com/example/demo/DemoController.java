package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping("/helloworld")
    public String helloworld(){
        return "hello world!";
    }

    @GetMapping("/dataeng")
    public String dataeng(){
        return "Apache Pulsar based UMF";
    }

    @GetMapping("/getName")
    public String getName(@RequestParam(value="name", defaultValue = ("Faran")) String name){
        return String.format("hello, %s", name);
    }

    @GetMapping("/getDuck")
    public ResponseEntity<Duck> getDuck(){
        return ResponseEntity.status(200).body(new Duck());
    }

    @PostMapping("/setDuck")
    public ResponseEntity<Duck> setDuck(@RequestBody String name){
        System.out.println("Server side: " + name);
        final Duck body = new Duck();
        body.setName(name);
        return ResponseEntity.status(200).body(body);
    }

}
