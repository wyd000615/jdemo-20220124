package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

/*    @Select("select id,name from test")
    List<User> select();

    @Insert("insert into test(name) values(#{name})")
    int insert(@Param("name") String name);*/

    List<User> selectAll();
    int insert(@Param("name") String name);
}
