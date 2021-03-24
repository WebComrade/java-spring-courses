package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component("personBean")
public class Person {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private String age;

    private static int num=0;
    private int curNum;

    private Pet pet;

    public Person (Pet pet){
        num++;
        curNum=num;
        this.pet = pet;
        System.out.println(this+": created");
    }

    public void Call(){
        System.out.println(this+": \"Call\" method");
        pet.Call();
    }

    public void ShowInfo(){
        System.out.println(this+":\n\tName: "+name+"\n\tAge: "+age);
    }

    @Override
    public String toString() {
        return "Person"+curNum;
    }
}
