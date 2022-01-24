package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.JService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("")
public class JController {
    @Autowired
    private JService jService;
    @RequestMapping("/query")
    public String query() {
        return "hello";
    }
    @PostMapping(value = "/select")
    public List<User> select() throws Exception {
        return jService.selectAll();
    }

    @PostMapping(value = "/insert")
    public int insert(@RequestParam(value = "name") String name) throws Exception {
        return jService.insert(name);
    }

}
