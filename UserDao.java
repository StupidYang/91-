package com.ncu.iqiyi.dao;

import com.ncu.iqiyi.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from user where username=#{username}")
    User findByUserName(String username);

    @Insert("insert into user (username, password) values (#{username},#{password})")
    void insert(String username, String password);
}
