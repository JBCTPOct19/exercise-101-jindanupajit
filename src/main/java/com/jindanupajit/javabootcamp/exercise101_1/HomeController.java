package com.jindanupajit.javabootcamp.exercise101_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/home")
    public String homePage() {
        return "test/home";
    }
}
