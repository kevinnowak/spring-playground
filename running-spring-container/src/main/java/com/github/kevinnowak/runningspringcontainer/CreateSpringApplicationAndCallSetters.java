package com.github.kevinnowak.runningspringcontainer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateSpringApplicationAndCallSetters {

    static void main(String[] args) {
        SpringApplication app = new SpringApplication(CreateSpringApplicationAndCallSetters.class);
        app.setHeadless(false);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLogStartupInfo(false);
        app.run(args);
    }

}
