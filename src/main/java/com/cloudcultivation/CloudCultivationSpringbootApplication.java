package com.cloudcultivation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jiejie
 */
@SpringBootApplication
@MapperScan("com.cloudcultivation.dao")
public class CloudCultivationSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCultivationSpringbootApplication.class, args);
    }

}
