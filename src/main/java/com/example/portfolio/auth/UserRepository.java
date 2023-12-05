package com.example.portfolio.auth;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserRepository {

    @Select("select * from users where name = #{username}")
    Optional<User> findByLoginUser(String username);

}