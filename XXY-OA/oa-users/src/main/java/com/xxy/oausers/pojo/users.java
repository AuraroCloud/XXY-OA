package com.xxy.oausers.pojo;

import java.util.Date;

/**
 * creat by sml
 * 2022-05-10
 **/
public class users {
    /*用户id*/
    private String user_id;
    /*用户实名*/
    private String user_name;
    /*账号名称*/
    private String login_name;
    /*登录密码*/
    private String password;
    /*创建时间*/
    private Date creat_time;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }
}
