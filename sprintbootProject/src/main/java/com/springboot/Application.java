package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @作者：hawk
 * @日期：2021/1/13 0013 21:23
 */
@SpringBootApplication
@MapperScan(value = "com.springboot.mapper")
//@ComponentScan({"com.springboot.controller","com.springboot.config"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
