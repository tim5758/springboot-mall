package com.tim.springbootmall.dao;

import com.tim.springbootmall.dto.UserRegisterRequest;
import com.tim.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
