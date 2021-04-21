package com.rutvikpatel.springmvc3.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping()
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
