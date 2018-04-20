package com.xiehou.share.springboot.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xiehou.share.springboot.model.User;

@Component
public interface UserDAO {

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //这个方式我自己加的
    List<User> selectAllUser(String name);
}
