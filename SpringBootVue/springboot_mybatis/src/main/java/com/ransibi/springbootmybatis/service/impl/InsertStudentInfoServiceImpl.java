//package com.ransibi.springboot_mybatis.service.impl;
//
//import com.ransibi.springboot_mybatis.dao.StudentMapper;
//import com.ransibi.springboot_mybatis.domain.Student;
//import com.ransibi.springboot_mybatis.service.InsertStudentInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
///**
// * @ClassName &{NAME}
// * @Description InsertStudentInfoServiceImpl
// * @Author code-ran
// * @Date 2022/7/18 03:42
// * @Version1.0
// */
//@Service
//public class InsertStudentInfoServiceImpl implements InsertStudentInfoService {
//    @Autowired
//    StudentMapper studentMapper;
//
//    @Override
//    public void insertStudentInfo() {
//        List<Student> studentList = new ArrayList<>();
//        for (int i = 0; i < 4; i++) {
//            Student student = new Student();
//            student.setId(i);
//            student.setName("张三");
//            student.setAge(10 * (i + 1));
//            student.setSex("男");
//            studentList.add(student);
//        }
//        for (int i = 0; i < studentList.size(); i++) {
//            studentMapper.insertStudentInfo(studentList.get(i).getId(), studentList.get(i).getName(), studentList.get(i).getAge(), studentList.get(i).getSex());
//        }
//    }
//}
