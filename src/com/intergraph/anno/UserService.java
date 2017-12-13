package com.intergraph.anno;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "userService")
public class UserService {

    //得到dao对象
    //1 定义dao类型属性
    //在dao属性上面使用注解完成对象注入
    @Autowired
//    private UserDao userDao;
//    //使用注解方式时候不需要set方法

    @Resource(name = "userDao")
    private UserDao userDao;

    public void add() {
        System.out.println("service..........");
        userDao.add();
    }
}
