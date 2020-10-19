package com.keminapera.springboot.dao.datasource;

import com.keminapera.springboot.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * @author keminapera
 * @date 2020/9/12
 */
@Slf4j
@Component
public class StudentDataSource {
    private static CopyOnWriteArrayList<Student> students = new CopyOnWriteArrayList<>();

    static {
        students.add(new Student("zhangsansan", 18));
        students.add(new Student("lisisi", 20));
        students.add(new Student("wangwu", 22));
        students.add(new Student("zhaoliu", 29));
    }

    public List<Student> getAll() {
        return students;
    }

    public Student findByName(String name) {
        log.info("从数据库中查询....");
        List<Student> collect = students.stream().filter(s -> name.equals(s.getName())).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(collect)) {
            return null;
        }
        return collect.get(0);
    }

    public Student updateStudent(Student student) {
        log.info("更新数据库中的数据....");
        for (Student stu : students) {
            if (StringUtils.equals(stu.getName(), student.getName())) {
                stu.setAge(student.getAge());
                return stu;
            }
        }
        return null;
    }

    public void deleteStudentByName(String name) {
        log.info("删除数据库中的数据....");
        students.removeIf(student -> StringUtils.equals(student.getName(), name));
    }

    public void addStudent(Student student) {
        log.info("给数据库中添加数据....");
        students.add(student);
    }
}
