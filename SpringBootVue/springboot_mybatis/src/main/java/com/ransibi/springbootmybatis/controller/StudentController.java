package com.ransibi.springbootmybatis.controller;

import com.ransibi.springbootmybatis.dao.StudentMapper;
import com.ransibi.springbootmybatis.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/info")
    public List<Student> getStudents() {
        List<Student> lst = studentMapper.selectAll();
        return lst;
    }
//    @PostMapping("/add")
//    public void addStudent(@RequestBody Student student){
//        StudentMapper.insert(student);
//    }
//    @PostMapping("delete")
//    public void deleteStudent(@RequestBody Student student){
//        StudentMapper.deleteById(student);
//    }
//    @PostMapping("update")
//    public void updateStudent(@RequestBody Student student){
//        StudentMapper.updateById(student);
//    }
}
