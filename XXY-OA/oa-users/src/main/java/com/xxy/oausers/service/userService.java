package com.xxy.oausers.service;

import com.xxy.oausers.pojo.users;

/**
 * creat by sml
 * 2022-05-17
 **/
public interface userService {
    //查询一个用户
    users queryUsers(Integer userId);
    //删除一个用户
    int deleteUsers(Integer id);
    //修改一个用户
    int updateUsers(Integer id);
    //增加一个用户
    int insertUsers(users users);
}
