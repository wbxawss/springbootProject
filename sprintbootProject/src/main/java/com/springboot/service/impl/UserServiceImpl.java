package com.springboot.service.impl;

import com.springboot.mapper.UserMapper;
import com.springboot.model.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @作者：hawk
 * @日期：2021/1/15 0015 22:55
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=false)//当我们在使用@Autowired注解的时候，默认required=true,表示注入的时候bean必须存在，否则注入失败。
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
