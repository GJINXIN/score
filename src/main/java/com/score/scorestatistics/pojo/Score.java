package com.score.scorestatistics.pojo;

import lombok.Data;

@Data
public class Score {
    private Integer id;

    private String subject;

    private Float score;

    private String type;

}