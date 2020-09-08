package com.keminapera.springboot.mapper;

import com.keminapera.springboot.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectById(Integer id);
}
