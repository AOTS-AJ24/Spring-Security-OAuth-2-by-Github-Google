package com.Abhi.SpringOauth2Project.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home_controller {

    @GetMapping("/")
    public String Spri (){

        return " u are inside buddy ";
    }
}
