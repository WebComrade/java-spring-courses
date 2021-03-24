package com.spring.rest;


import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.spring.rest.lenta.Communication;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
////        System.out.println(communication.getUser(9));
//        User user = communication.getUser(17);
//        communication.deleteUser(17);
        System.out.println(communication.getPage());
    }
}
