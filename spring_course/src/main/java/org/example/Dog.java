package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component("dogBean")
public class Dog implements Pet {

    private static int num=0;
    private int curNum;

    public void Call(){
        System.out.println(this+": \"Call\" method");
    }

    public Dog(){
        num++;
        curNum=num;
        System.out.println(this+": created");
    }

    @PostConstruct
    private void init(){
        System.out.println(this+": init method");
    }

    @PreDestroy
    private void destroy(){
        System.out.println(this+" destroy method");
    }

    @Override
    public String toString() {
        return "Dog"+curNum;
    }
}
