package com.score.scorestatistics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.score.scorestatistics.mapper")
public class ScoreStatisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreStatisticsApplication.class, args);
    }

}
