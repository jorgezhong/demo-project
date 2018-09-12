package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  /*  public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }*/

    public static void main(String[] args) {


        Integer a = 1000000;


        Integer b = a;

        a++;

        System.out.println(a == b);

        System.out.println("b = " + b);
        System.out.println("a = " + a);

    }


}
