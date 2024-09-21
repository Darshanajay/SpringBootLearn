package com.springboot.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DarshanMe {

    @Autowired //Field Injection
    private Name Mname;

//    public DarshanMe(Name , Mname){ //Constracter Injection
//        this.Mname = Mname;
//    }

    //@Autowired
//    public void setMname(Name , Mname){  //Setter Injection
//        this.Mname = Mname;
//    }
    @Autowired
//    @Qualifier("desktop")
    @Qualifier("laptop")
    private Computer Comp;



    public void code(){
        System.out.println(Mname.getMname()+" job is coding");
        Comp.run();
    }




}
