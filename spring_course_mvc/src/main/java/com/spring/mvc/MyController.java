package com.spring.mvc;

import com.spring.mvc.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    private static List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }

    @RequestMapping("/")
    public String askDetails(Model model){
        model.addAttribute("user",new User());
        return "registration";
    }

    @RequestMapping("/info")
    public String showDetails(  @Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "registration";
        }
        else{
            userList.add(user);
            return "info";
        }
    }

    @RequestMapping("/userList")
    public String showUsers(HttpServletRequest request){
        if(request.getAttribute("name")!=null){
            String name = (String)request.getAttribute("name");
            for(User user:userList){
                if(user.getName().equals(name)){
                    userList.remove(user);
                }
            }
        }
        return "userList";
    }



}
