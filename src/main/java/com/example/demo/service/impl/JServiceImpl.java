package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.JService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JServiceImpl implements JService {
    @Autowired
    private UserMapper userMapper;  //这里会有报错，不用管

    @Override
    public List<User> select() {
        return userMapper.selectAll();
    }

    @Override
    public int insert(String name) {
        return userMapper.insert(name);

    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
