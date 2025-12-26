package com.github.kevinnowak.beanclasspathscanning;

import org.springframework.boot.SpringApplication;

class ApplicationWithoutSpringBootAnnotation {

    static void main(String[] args) {
        SpringApplication.run(SpringBootConfig.class, args);
    }
}
