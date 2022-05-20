package com.xxy.oausers.mapper;


import com.xxy.oausers.pojo.users;
import org.apache.ibatis.annotations.Mapper;

/**
 * creat by sml
 * 2022-05-10
 **/
@Mapper
public interface usersMapper {
    //增加一个用户
    int insertUser(users users);
    //删除一个用户
    int   deleteUser(Integer userId);
    //查询一个用户
    users selectUser(Integer userId);
    //修改用 户的信息
    int updateUser(Integer userId);


}
