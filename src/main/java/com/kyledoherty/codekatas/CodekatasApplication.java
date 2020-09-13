package com.kyledoherty.codekatas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.kyledoherty.codekatas.CreatePhoneNumber.createPhoneNumber;

@SpringBootApplication
public class CodekatasApplication {

    public static void main(String[] args) {

        SpringApplication.run(CodekatasApplication.class, args);

        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}
