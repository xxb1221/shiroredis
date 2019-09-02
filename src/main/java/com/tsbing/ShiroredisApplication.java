package com.tsbing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * shiroredis
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.tsbing.dao"}) //扫描DAO
public class ShiroredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroredisApplication.class, args);
    }

}
