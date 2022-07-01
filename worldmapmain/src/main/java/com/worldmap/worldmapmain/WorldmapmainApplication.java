package com.worldmap.worldmapmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.worldmap.commons")
public class WorldmapmainApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorldmapmainApplication.class, args);
    }

}
