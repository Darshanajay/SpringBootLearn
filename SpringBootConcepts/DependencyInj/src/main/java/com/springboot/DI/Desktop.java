package com.springboot.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {


    @Override
    public void run() {
        System.out.println("Code run by Desktop");
    }
}
