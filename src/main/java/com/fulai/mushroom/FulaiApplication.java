package com.fulai.mushroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.fulai.mushroom")
@MapperScan("com.fulai.mushroom.dao")
public class FulaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FulaiApplication.class, args);
    }

}
