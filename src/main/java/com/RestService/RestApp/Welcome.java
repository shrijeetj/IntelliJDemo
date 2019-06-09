package com.RestService.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome
{
    @RequestMapping("/welcome")
    public String index()
    {
            return "Hello Welcome to my first IntelliJ project!";
    }

    @RequestMapping("/Bye")
    public String bye()
    {
        return "Bye";
    }
}
