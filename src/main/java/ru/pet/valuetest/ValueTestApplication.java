package ru.pet.valuetest;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueTestApplication {

    public static void main(String[] args) {

        Config config = new Config();
        System.out.println(config.getMax());
    }
}
