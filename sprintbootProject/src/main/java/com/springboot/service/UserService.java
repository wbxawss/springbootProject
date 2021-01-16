package com.springboot.service;


import com.springboot.mapper.UserMapper;
import com.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @作者：hawk
 * @日期：2021/1/15 0015 21:18
 */

public interface UserService {
    User Sel(int id);
}
