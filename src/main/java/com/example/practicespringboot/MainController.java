package com.example.practicespringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.FilterConfig;


@RestController
@Controller
public class MainController {

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }


    public void init(FilterConfig filterConfig) {

    }

    public void destroy() {}
}
