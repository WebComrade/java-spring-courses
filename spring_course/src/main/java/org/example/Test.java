package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Pet dog = context.getBean("dogBean",Dog.class);
        dog.Call();
        Person person = context.getBean("personBean",Person.class);
        person.Call();
        person.ShowInfo();
    }
}
