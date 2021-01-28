package com.score.scorestatistics.controller;

import com.score.scorestatistics.pojo.Score;
import com.score.scorestatistics.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/score")
public class ScoresController {

    @Autowired
    private ScoresService scoresService;

    /*添加成绩*/
    @PostMapping("/addScore")

    public String addScores(Score scores) {
        try {
            this.scoresService.addScores(scores);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }
}
