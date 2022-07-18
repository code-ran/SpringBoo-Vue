package com.ransibi.springbootmybatis.dao;

import com.ransibi.springbootmybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    List<Student> selectAll();
}

