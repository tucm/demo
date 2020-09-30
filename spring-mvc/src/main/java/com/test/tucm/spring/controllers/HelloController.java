package com.test.tucm.spring.controllers;

import com.test.tucm.spring.utils.ApplicationContextUtils;
import com.test.tucm.springmvcinnner.service.InnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author owl
 * @Date 2020-06-13 19:35
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @Autowired
    private ApplicationContextUtils applicationContextUtils;

    @Autowired
    private InnerService innerService;

    @GetMapping("/hello")
    @ResponseBody
    public String handle(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(Model model) {
        ApplicationContext applicationContext = applicationContextUtils.getContext();
        System.out.println(applicationContext);
        innerService.method();
        WebApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
        return "get";
    }
}
