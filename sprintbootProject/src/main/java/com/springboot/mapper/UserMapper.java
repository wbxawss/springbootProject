package com.springboot.mapper;

import com.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @作者：hawk
 * @日期：2021/1/15 0015 21:18
 */
@Mapper
public interface UserMapper {

    User Sel(int id);
}
