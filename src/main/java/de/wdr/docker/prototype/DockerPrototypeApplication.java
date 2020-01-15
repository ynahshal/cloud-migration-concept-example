package de.wdr.docker.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DockerPrototypeApplication extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        SpringApplication.run(DockerPrototypeApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(DockerPrototypeApplication.class);
    }

}
