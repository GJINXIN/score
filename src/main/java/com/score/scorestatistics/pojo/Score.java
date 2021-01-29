package com.score.scorestatistics.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private Integer id;

    private String subject;

    private Float score;

    private String type;

    private Date tDate;

}