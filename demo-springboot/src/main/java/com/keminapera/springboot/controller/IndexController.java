package com.keminapera.springboot.controller;

import com.keminapera.module.controller.ModeuleIndexController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private ModeuleIndexController indexController;
    @GetMapping("/index")
    public void index() {
        System.out.println("this is IndexController index method !!!!");
        indexController.index();
    }
}
