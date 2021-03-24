package com.spring.mvc.controller;

import com.spring.mvc.dao.UserDAO;
import com.spring.mvc.entity.User;
import com.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showAllUsers(Model model){

        List<User> allUsers =  userService.getAllUsers();
        model.addAttribute("allUsers",allUsers);
        model.addAttribute("mocha","mocha");
        return "user-list";
    }

    @RequestMapping("/registration")
    public String addNewUser(Model model){

        User user = new User();
        model.addAttribute("user",user);

        return "registration";
    }

    @RequestMapping("/save-user")
    public String saveUser(@ModelAttribute("user") User user){

        userService.saveUser(user);

        return "redirect:/";
    }

    @RequestMapping("/update-info")
    public String updateUser(@RequestParam("userId") int id, Model model){

        User user = userService.getUser(id);
        model.addAttribute("user", user);

        return "registration";
    }

    @RequestMapping("/delete-info")
    public String deleteUser(@RequestParam("userId") int id){

        userService.deleteUser(id);

        return "redirect:/";
    }
}
