package com.github.kevinnowak.runningspringcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
class UsingApplicationContext {

    static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(UsingApplicationContext.class, args);

        Arrays.stream(ctx.getBeanDefinitionNames())
                .sorted()
                .forEach(System.out::println);
    }
}
