package com.works.bryant.controller;

import com.works.bryant.service.User;

import javax.annotation.Resource;

public class UserController {
    @Resource
    /*在这里相当于依赖注入,可以去使用对象了*/
    private User user;

    public void test(){
        user.setAge(18);
    }
}
