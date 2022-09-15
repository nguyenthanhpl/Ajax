package com.example.ajax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.ajax.Repo")

public class AjaxApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjaxApplication.class, args);
    }

}
