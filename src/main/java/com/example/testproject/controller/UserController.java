/**
 * Copyright (C), 2015-2019, 东华云有限公司
 * FileName: UserController
 * Author:   HeZeyu
 * Date:     2019/3/1 9:50
 * Description: 控制层
 * History:
 * UserController         9:50          10.1.1          控制层
 * 姓名           修改时间           版本号              描述
 */
package com.example.testproject.controller;

import com.example.testproject.Service.UserService;
import com.example.testproject.entity.UserEntity;
import com.example.testproject.itools.RedisItools;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private Logger logger=Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private RedisItools redisItools;
    @RequestMapping("list")
    public List<UserEntity> list(){
        List<UserEntity> list=userService.findAll();
        logger.debug(list.get(0).getUsername());
        redisItools.set("测试",list.get(0).getUsername());

        return  list;
    }
    @RequestMapping("login")
    public UserEntity login(UserEntity userEntity){
        UserEntity userEntity1=userService.finduser(userEntity);
        return  userEntity1;
    }


}