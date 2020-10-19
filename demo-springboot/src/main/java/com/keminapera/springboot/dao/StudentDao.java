package com.keminapera.springboot.dao;

import com.keminapera.springboot.dao.datasource.StudentDataSource;
import com.keminapera.springboot.exception.RecordNotFountException;
import com.keminapera.springboot.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/12
 */
@Slf4j
@Component
public class StudentDao {
    @Autowired
    private StudentDataSource studentDataSource;

    public List<Student> getAll() {
        log.info("从数据库获取所有学生信息...");
        return studentDataSource.getAll();
    }

    public Student getStudentByName(String name) {
        log.info("从数据库获取姓名为：" + name +"的学生信息");
        Student studentInDb = studentDataSource.findByName(name);
        if (studentInDb == null) {
            throw new RecordNotFountException("该学生不存在，name=" + name);
        }
        return studentInDb;
    }

    public Student updateStudet(Student student) {
        getStudentByName(student.getName());
        log.info("修改数据库中Student对象");
        return studentDataSource.updateStudent(student);
    }

    public void deleteStudentByName(String name) {
        studentDataSource.findByName(name);
        log.info("删除数据库中姓名为："+ name + "的学生信息");
        studentDataSource.deleteStudentByName(name);
    }

    public Student addStudent(Student student) {
        alreadyExist(student.getName());
        log.info("向数据库中添加姓名为：" + student.getName() + "学生信息");
        studentDataSource.addStudent(student);
        return student;
    }

    private void alreadyExist(String name) {
        Student studentInDb = studentDataSource.findByName(name);
        if (studentInDb != null) {
            throw new IllegalArgumentException("姓名为：" + name +"学生已经存在");
        }
    }
}
