package com.test.tucm.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author owl
 * @Date 2020-06-13 19:35
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String handle(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }
}
