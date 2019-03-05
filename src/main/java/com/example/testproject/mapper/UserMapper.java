/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserMapper
 * Author:   GBK
 * Date:     2019/3/1 9:38
 * Description: 操作用户信息接口
 * History:
 * GBK          2019/3/1 9:38     10.1.1.1          操作用户信息接口
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.testproject.mapper;

import com.example.testproject.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈操作用户信息接口〉
 *
 * @author GBK
 * @create 2019/3/1
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {

    public List<UserEntity> findAll();

    public UserEntity finduser(UserEntity userEntity);
}
