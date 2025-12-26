package com.github.kevinnowak.beanclasspathscanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.util.unit.DataSize;

@SpringBootApplication
public class BeanClasspathScanningApplication {

    static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BeanClasspathScanningApplication.class, args);

        ComponentFileSystem fs = ctx.getBean(ComponentFileSystem.class);
        IO.println(DataSize.ofBytes(fs.getFreeDiskSpace()).toGigabytes() + " GB");
    }

}
