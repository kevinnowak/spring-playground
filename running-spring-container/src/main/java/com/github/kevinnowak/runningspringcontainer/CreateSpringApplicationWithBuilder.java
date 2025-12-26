package com.github.kevinnowak.runningspringcontainer;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
class CreateSpringApplicationWithBuilder {

    static void main(String[] args) {
        new SpringApplicationBuilder(CreateSpringApplicationWithBuilder.class)
                .headless(false)
                .bannerMode(Banner.Mode.OFF)
                .logStartupInfo(false)
                .run(args);
    }
}
