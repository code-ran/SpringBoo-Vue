package com.ransibi.springbootmybatis.dao;

import com.ransibi.springbootmybatis.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    List<Book> selectAll();
}

