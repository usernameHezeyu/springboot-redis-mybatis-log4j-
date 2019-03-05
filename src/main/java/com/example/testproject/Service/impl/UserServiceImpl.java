/**
 * Copyright (C), 2015-2019, 东华云有限公司
 * FileName: UserServiceImpl
 * Author:   HeZeyu
 * Date:     2019/3/1 9:45
 * Description: 操作用户业务实现类
 * History:
 * UserServiceImpl         9:45          10.1.1          操作用户业务实现类
 * 姓名           修改时间           版本号              描述
 */
package com.example.testproject.Service.impl;

import com.example.testproject.Service.UserService;
import com.example.testproject.entity.UserEntity;
import com.example.testproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired  //他说，没有找到实现类，没关系。直接用
    private UserMapper userMapper;

    @Override
    public UserEntity finduser(UserEntity userEntity) {
        return userMapper.finduser(userEntity);
    }

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> list = userMapper.findAll();
        return list;
    }
}