package org.aop;

import org.aop.Objects.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("start");

        User user = context.getBean("userBean", User.class);
        ControlSystem conSys = context.getBean("controlSystem",ControlSystem.class);
        try {
            conSys.addUser(user);
        }
        catch (Exception e){

        }
        conSys.showUserInfo();

        context.close();
    }

}
