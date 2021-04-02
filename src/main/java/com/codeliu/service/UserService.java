package com.codeliu.service;

import com.codeliu.model.User;
import com.codeliu.model.UserExample;

/**
 * 继承 BaseService，可以直接使用BaseService实现的一些通用查询接口
 */
public interface UserService extends BaseService<User, UserExample> {
}
