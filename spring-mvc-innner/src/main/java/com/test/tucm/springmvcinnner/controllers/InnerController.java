package com.test.tucm.springmvcinnner.controllers;

import com.test.tucm.springmvcinnner.utils.InnerApplicationContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
public class InnerController {

    @Autowired
    private InnerApplicationContextUtils innerApplicationContextUtils;

    @GetMapping("/my")
    @ResponseBody
    public String handle(Model model) {
        ApplicationContext applicationContext = innerApplicationContextUtils.getContext();
        System.out.println(applicationContext);
        return "my";
    }
}
