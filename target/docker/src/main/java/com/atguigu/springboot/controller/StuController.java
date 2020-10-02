package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Stu;
import com.atguigu.springboot.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StuController {

    @Autowired
    StuMapper stuMapper;

    @GetMapping("/api/v1/student")
    public List<Stu> getStu() {
        return stuMapper.getStu();
    }

    @PostMapping("/api/v1/student")
    public Stu insertStu(Stu stu){
        System.out.println("POST请求收到");
        stuMapper.insertStu(stu);
        return stu;
    }

    @PutMapping("/api/v1/student")
    public Stu updateStu(Stu stu){
        System.out.println("PUT请求收到");
        stuMapper.updateDept(stu);
        return stu;
    }

    @DeleteMapping("/api/v1/student")
    public Stu deleteStu(Stu stu){
        System.out.println("DELETE请求收到");
        stuMapper.deleteStuById(stu.getStudentId());
        return stu;
    }

}
