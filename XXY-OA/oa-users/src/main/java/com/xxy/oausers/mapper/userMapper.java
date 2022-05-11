package com.xxy.oausers.mapper;

import com.xxy.oausers.pojo.users;

/**
 * creat by sml
 * 2022-05-10
 **/
public interface userMapper {
    //增加一个用户
    int insertUser();
    //删除一个用户
    int   deleteUser();
    //查询一个用户
    users selectUser();
    //修改用 户的信息
    int updateUser();


}
