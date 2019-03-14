package com.xiehou.share.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xiehou.share.springboot.model.BaseResult;
import com.xiehou.share.springboot.model.JobDTO;
import com.xiehou.share.springboot.model.User;
import com.xiehou.share.springboot.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService         userService;
    private RestTemplate        restTemplate = new RestTemplate();

    private static final String BATCH_URL    = "http://localhost:7080/submiBatch";

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

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    @ResponseBody
    public Integer save(@RequestParam String name, @RequestParam Integer id) {
        return userService.save(id, name);
    }

    @RequestMapping(value = "/submiBatch", method = RequestMethod.POST)
    @ResponseBody
    public void submiBatch(@RequestParam String name, @RequestParam Integer id) {
        JobDTO jobDTO = new JobDTO();
        jobDTO.setModuleCode("godSynTestProcessModule");
        jobDTO.setJobCode("godSynTestJobProcess");
        jobDTO.setBusinessNo("121121");
        jobDTO.setOperator("admin");
        jobDTO.setJobParams("1234567");
        restTemplate.postForEntity(BATCH_URL, jobDTO, BaseResult.class);
    }
}
