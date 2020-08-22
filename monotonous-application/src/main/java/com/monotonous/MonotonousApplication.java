package com.monotonous;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author beats
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan("com.monotonous.repository.mapper")
public class MonotonousApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonotonousApplication.class, args);
    }


}
