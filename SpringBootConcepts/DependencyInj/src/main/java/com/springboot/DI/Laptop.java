package com.springboot.DI;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void run(){
        System.out.println("code run by laptop");
    }
}
