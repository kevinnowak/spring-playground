package com.github.kevinnowak.beanclasspathscanning;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.github.kevinnowak.beanclasspathscanning")
@ComponentScan(basePackageClasses = {ComponentFileSystem.class, ServiceFileSystem.class})
class SpringBootConfig {
}
