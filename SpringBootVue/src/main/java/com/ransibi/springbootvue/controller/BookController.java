package com.ransibi.springbootvue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName &{NAME}
 * @Description BookController
 * @Author code-ran
 * @Date 2022/7/14 18:05
 * @Version1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping({"getInfo"})
    public String getById(){
        return "你好springboot";
    }
}
