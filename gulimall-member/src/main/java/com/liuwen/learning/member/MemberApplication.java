package com.liuwen.learning.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.liuwen.learning.member.dao")
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {

        SpringApplication.run(MemberApplication.class, args);
    }
}
