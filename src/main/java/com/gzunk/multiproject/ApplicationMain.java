package com.gzunk.multiproject;

import com.gzunk.multiproject.config.Multiproject;
import com.gzunk.multiproject.environment.Environments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({Multiproject.class, Environments.class})
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }

}
