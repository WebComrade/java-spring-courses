package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view-for-all-emps";
    }

    @GetMapping("/hr-info")
    public String infoOnlyForHR(){
        return "view-for-hr";
    }

    @GetMapping("/manager-info")
    public String infoOnlyForManagers(){
        return "view-for-manager";
    }

}
