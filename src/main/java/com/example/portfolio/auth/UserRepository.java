package com.example.portfolio.auth;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserRepository {

    @Select("select * from users where email = #{email}")
    Optional<User> findByLoginUser(String email);

}