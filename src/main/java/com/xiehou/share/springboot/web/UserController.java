package com.xiehou.share.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xiehou.share.springboot.model.User;
import com.xiehou.share.springboot.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User list(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @RequestMapping("/user/all/{name}")
    @ResponseBody
    public List<User> list(@PathVariable String name) {
        List<User> users = userService.queryAllByName(name);
        System.out.println(users);
        return users;
    }
}
