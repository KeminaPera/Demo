package com.keminapera.springboot.controller;

import com.keminapera.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

/**
 * @author keminapera
 * @date 2020/9/15
 */
@RestController
@RequestMapping("/cachemanager")
public class CacheManagerController {
    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/names")
    public ResponseEntity<Collection<String>> cacheNames() {
        Collection<String> cacheNames = cacheManager.getCacheNames();
        return ResponseEntity.ok(cacheNames);
    }

    @GetMapping("/add")
    public ResponseEntity<String> addStudent() {
        Cache haha = cacheManager.getCache("haha");
        haha.put("students", new Student("haha", 18));
        return ResponseEntity.ok("添加成功！！！");
    }

    @GetMapping("/get")
    public ResponseEntity<Student> getStudent() {
        Cache haha = cacheManager.getCache("haha");
        Student students = (Student)haha.get("students").get();
        return ResponseEntity.of(Optional.ofNullable(students));
    }
}
