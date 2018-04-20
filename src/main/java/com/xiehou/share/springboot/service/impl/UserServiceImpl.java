package com.xiehou.share.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiehou.share.springboot.dao.UserDAO;
import com.xiehou.share.springboot.model.User;
import com.xiehou.share.springboot.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDao;

    @Override
    public User findById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public List<User> queryAllByName(String name) {
        return userDao.selectAllUser(name);
    }
}
