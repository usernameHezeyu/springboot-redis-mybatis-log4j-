/**
 * Copyright (C), 2015-2019, 东华云有限公司
 * FileName: user
 * Author:   HeZeyu
 * Date:     2019/3/1 9:31
 * Description: 用户实体类
 * History:
 * user         9:31          10.1.1          用户实体类
 * 姓名           修改时间           版本号              描述
 */
package com.example.testproject.entity;

public class UserEntity {

    private  Integer userid;
    private  String username;
    private  String password;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}