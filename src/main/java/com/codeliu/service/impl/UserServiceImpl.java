package com.codeliu.service.impl;

import com.codeliu.mapper.UserMapper;
import com.codeliu.model.User;
import com.codeliu.model.UserExample;
import com.codeliu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, UserExample> implements UserService {

    @Autowired
    private UserMapper userMapper;
}
