package com.xiehou.share.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.访问/user/${id}接口，查看SQL、Web、AOP监控效果，如：http://127.0.0.1:8080/user/1
 * 2，http://localhost:8080/user/all/{name}查看查询结果
 * </p>
 */
@SpringBootApplication
@MapperScan("com.xiehou.share.springboot.dao")
public class GodApplication {
    public static void main(String[] args) {
        SpringApplication.run(GodApplication.class, args);
    }
}
