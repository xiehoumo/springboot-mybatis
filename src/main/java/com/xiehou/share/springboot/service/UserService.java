package com.xiehou.share.springboot.service;

import java.util.List;

import com.xiehou.share.springboot.model.User;

public interface UserService {
    User findById(Integer id);

    List<User> queryAllByName(String name);
}
