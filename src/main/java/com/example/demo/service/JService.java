package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface JService {
    List<User> select();

    int insert(String name);

    List<User> selectAll();
}
