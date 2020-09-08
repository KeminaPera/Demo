package com.keminapera.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexContorller {
    @GetMapping("index")
    public String index() {
        return "index";
    }
}
