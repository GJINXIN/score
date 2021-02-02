package com.score.scorestatistics.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Score {
    private Integer id;

    private String subject;

    private Float score;

    private String type;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date tDate;
}