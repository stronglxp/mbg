package com.codeliu.controller;

import com.codeliu.model.User;
import com.codeliu.model.UserExample;
import com.codeliu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    public Object list() {
        UserExample example = new UserExample();
        List<User> list = userService.selectByExample(example);

        return list;
    }
}
