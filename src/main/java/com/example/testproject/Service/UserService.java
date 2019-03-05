/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserService
 * Author:   GBK
 * Date:     2019/3/1 9:44
 * Description: 操作用户业务接口
 * History:
 * GBK          2019/3/1 9:44     10.1.1.1          操作用户业务接口
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.testproject.Service;

import com.example.testproject.entity.UserEntity;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈操作用户业务接口〉
 *
 * @author GBK
 * @create 2019/3/1
 * @since 1.0.0
 */
public interface UserService {

    public List<UserEntity> findAll();
    public UserEntity finduser(UserEntity userEntity);
}
