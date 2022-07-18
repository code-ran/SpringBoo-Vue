package com.ransibi.springbootvue.controller;

import com.ransibi.springbootvue.common.DictTypeIgnoreProperties;
import com.ransibi.springbootvue.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName &{NAME}
 * @Description BookController
 * @Author code-ran
 * @Date 2022/7/14 18:05
 * @Version1.0
 */
@RestController
@RequestMapping("/books")
public class Student {
    @Value("${suspend.status.value}")
    private String suspend;

    //读取配置文件中的一组数据的内容
    @Autowired
    DictTypeIgnoreProperties dictTypeIgnoreProperties;

    //使用自动装配，将所有的数据封装到一个Environment对象中
    @Autowired
    private Environment environment;


    @PostMapping
    public String save(@RequestBody Book book) {
        return "{'model':'book save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return "{'model':'book delete'}" + id;
    }


    @PutMapping
    public String update(@RequestBody Book book) {
        return "{'model':'book update'}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        return "{'model':'book getById'}" + id;
    }

    @GetMapping
    public String getAll() {
        System.out.println("====="+environment.getProperty("suspend.status.value"));
        return "{'model':'book getAll'}" + dictTypeIgnoreProperties;
    }
}
