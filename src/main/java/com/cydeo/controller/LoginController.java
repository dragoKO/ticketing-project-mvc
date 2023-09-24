package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = {"/login","/"}) // localhost:8000/login or localhost:8000/
    public String login(){

        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}