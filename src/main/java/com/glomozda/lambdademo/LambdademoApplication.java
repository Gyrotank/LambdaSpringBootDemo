package com.glomozda.lambdademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class LambdademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LambdademoApplication.class, args);
    }

    @Bean
    public Function<String, String> reverseString(){
        return (s) -> String.valueOf(new StringBuilder(s).reverse());
    }
}
