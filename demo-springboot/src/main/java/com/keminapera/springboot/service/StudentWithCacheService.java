package com.keminapera.springboot.service;

import com.keminapera.springboot.dao.datasource.StudentDataSource;
import com.keminapera.springboot.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/13
 */

@Slf4j
@Service
public class StudentWithCacheService {
    @Autowired
    private StudentDataSource dataSource;

    @Cacheable(cacheNames = "student")
    public List<Student> getAll() {
        return dataSource.getAll();
    }

    @Cacheable(cacheNames = "student", key = "#name")
    public Student getStudent(String name) {
        return dataSource.findByName(name);
    }
}
