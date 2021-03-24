package org.aop.Objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class User {

    String name;
    String pass;

    public User(String name, String pass){
        this.name = name;
        this.pass = pass;
        System.out.println(this+": created");
    }

    public User(){
        this.name = "default";
        this.pass = "123456";
        System.out.println(this+": created");
    }

    public List getInfo(){
        return Arrays.asList(name,pass);
    }

    @Override
    public String toString() {
        return "["+name+"]";
    }
}
