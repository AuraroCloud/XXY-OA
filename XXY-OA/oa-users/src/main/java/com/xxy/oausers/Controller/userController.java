package com.xxy.oausers.Controller;

import com.xxy.oausers.pojo.users;
import com.xxy.oausers.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * creat by sml
 * 2022-05-10
 **/
@Controller

public class userController  {

    @Resource
    userService userService;


    @RequestMapping("/select")
     public  users  select01(Integer id){
      users users=userService.queryUsers(id);
        return  users;
}

}
