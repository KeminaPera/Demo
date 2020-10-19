package com.keminapera.module.controller;

import com.keminapera.module.service.ModuleUserService;
import lombok.Setter;

@Setter
public class ModuleUserController {

    private ModuleUserService moduleUserService;
    public void sayHello() {
        System.out.println("Hello Keminapera! I'm ModuleUserController sayHello method ....");
        moduleUserService.sayHello();
    }
}
