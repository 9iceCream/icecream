package com.monolog7.icecream.dao;

import com.monolog7.icecream.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IUserDao {
    int addUser(User user);
    User getUserByName(String username);
    int updateUserByName(@Param("oldUsername") String oldUsername, @Param("user") User user);
    int deleteUserByName(String username);
}
