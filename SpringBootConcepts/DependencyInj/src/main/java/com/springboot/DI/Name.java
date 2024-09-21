package com.springboot.DI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Name {
    private String Mname;

    public String getMname() {
        return Mname;
    }

    @Value("Darshan")
    public void setMname(String mname) {
        Mname = mname;
    }
}
