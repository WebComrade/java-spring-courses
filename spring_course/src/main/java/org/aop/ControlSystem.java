package org.aop;

import org.aop.Objects.User;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ControlSystem {

    List<User> userList = new ArrayList<>();

    public User addUser(User user) throws IOException{
        userList.add(user);
//        throw new IOException();
        System.out.println("[ConSys]: added user "+user);
        return user;
    }

    public void showUserInfo(){
        System.out.println("[ConSys]:");
        for(User user:userList){
            System.out.println("\t"+user.getInfo().get(0)+" | "+user.getInfo().get(1));
        }
    }
//    @Override
//    public String toString() {
//        return "[ConSys]";
//    }
}
