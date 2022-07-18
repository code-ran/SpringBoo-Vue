package com.ransibi.springbootmybatis.domain;

import lombok.Data;

/**
 * @ClassName &{NAME}
 * @Description Book
 * @Author code-ran
 * @Date 2022/7/18 03:21
 * @Version1.0
 */
@Data
public class Student {
    private long id;
    private String bookNumber;
    private String bookName;
    private String bookType;
    private Double bookPrize;
    private String author;
    private String bookPublisher;
}
