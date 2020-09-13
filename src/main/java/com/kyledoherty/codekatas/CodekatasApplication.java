package com.kyledoherty.codekatas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodekatasApplication {

    public static void main(String[] args) {

        SpringApplication.run(CodekatasApplication.class, args);

        String word = "Kyle Doherty";
        System.out.println(word.lastIndexOf('e'));
    }

}
