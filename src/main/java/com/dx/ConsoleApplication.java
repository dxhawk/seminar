package com.dx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 程序的启动入口
 *
 * @author DOUBLEX
 */
@SpringBootApplication
@EnableCaching
public class ConsoleApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ConsoleApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApplication.class, args);
    }
}