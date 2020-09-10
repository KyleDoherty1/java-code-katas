package com.kyledoherty.codekatas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.kyledoherty.codekatas.Accumul.accum;

@SpringBootApplication
public class CodekatasApplication {

    public static void main(String[] args) {

        SpringApplication.run(CodekatasApplication.class, args);

        System.out.println(accum("ZpglnRxqenU"));
    }

}
