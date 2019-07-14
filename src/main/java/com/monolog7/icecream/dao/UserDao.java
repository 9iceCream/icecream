package com.monolog7.icecream.dao;

import com.monolog7.icecream.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    int addUser(User user);
    User getUserByName(String username);
    int updateUserByName(String oldUsername,User user);
    int deleteUserByName(String username);
}
