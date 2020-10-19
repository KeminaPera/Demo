package com.keminapera.springboot.service;

import com.keminapera.springboot.dao.StudentDao;
import com.keminapera.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/12
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private CacheManager cacheManager;

    public List<Student> getAll() {
        return studentDao.getAll();
    }
    @Cacheable(value = "students", key = "#name")
    public Student getStudentByName(String name) {
        return studentDao.getStudentByName(name);
    }
    @CachePut(cacheNames = "students", key = "#student.name")
    public Student updateStudent(Student student) {
        return studentDao.updateStudet(student);
    }
    @CacheEvict(cacheNames = "students", key = "#name")
    public void deleteStudentByName(String name) {
        studentDao.deleteStudentByName(name);
    }

    @Cacheable()
    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }
}
