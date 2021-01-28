package com.score.scorestatistics.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Score {
    private Integer id;

    private String subject;

    private Float score;

    private String type;

}