package com.spring.rest.controller;

import com.spring.rest.entity.User;
import com.spring.rest.exceptionHandling.NoSuchUserException;
import com.spring.rest.exceptionHandling.UserIncorrectData;
import com.spring.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}") // {id} - pathVariable
    public User showUser(@PathVariable int id){
        User user =  userService.getUser(id);

        if(user==null){
            throw new NoSuchUserException("There is no user with ID = "+id+" in database");
        }

        return user;
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){

        userService.saveUser(user);

        return user;
    }


    @PutMapping("/users")
    public User updateUser(@RequestBody User user){

        userService.saveUser(user);
        return user;

    }

    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id){

        User user = userService.getUser(id);
        userService.deleteUser(id);
        return user;
    }

    @DeleteMapping("/users")
    public List<User> deleteAllUsers(){
        List<User> userList = userService.getAllUsers();
        userService.deleteAllUsers();

        return userList;

    }


}
