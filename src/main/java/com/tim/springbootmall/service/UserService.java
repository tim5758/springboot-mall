package com.tim.springbootmall.service;

import com.tim.springbootmall.dto.UserLoginRequest;
import com.tim.springbootmall.dto.UserRegisterRequest;
import com.tim.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
    User login(UserLoginRequest userLoginRequest);
}
