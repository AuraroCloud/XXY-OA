package com.xxy.oausers.impl;

import com.xxy.oausers.mapper.usersMapper;
import com.xxy.oausers.pojo.users;
import com.xxy.oausers.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * creat by sml
 * 2022-05-17
 **/
@Service
public class userServiceImpl implements userService {
    @Resource
    usersMapper userMapper;

    @Override
    public users queryUsers( Integer    userId) {
        return userMapper.selectUser(userId);
    }

    @Override
    public int deleteUsers(Integer id) {
        return 0;
    }

    @Override
    public int updateUsers(Integer id) {
        return 0;
    }

    @Override
    public int insertUsers(users users) {
        return 0;
    }
}
