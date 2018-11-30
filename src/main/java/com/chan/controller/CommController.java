package com.chan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
