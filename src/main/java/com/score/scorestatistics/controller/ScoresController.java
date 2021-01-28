package com.score.scorestatistics.controller;

import com.score.scorestatistics.pojo.Score;
import com.score.scorestatistics.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoresController {

    @Autowired
    private ScoresService scoresService;

    /*添加成绩*/
    @PostMapping("/addScore")
    public String addScore(Score score) {
        try {
            this.scoresService.addScores(score);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    /*查询所有成绩*/
    @GetMapping("/findScoreAll")
    public String findScoreAll(Model model) {
        try {
            List<Score> list = this.scoresService.findScoreAll();
            model.addAttribute("allScorelist", list);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "score";
    }

    /*预更新成绩查询*/
    @GetMapping("/preUpdateScore")
    public String preUpdateScore(Integer id, Model model) {
        try {
            Score score = this.scoresService.preUpdateScore(id);
            model.addAttribute("score", id);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "score";
    }

    /*更新成绩*/
    @PostMapping("/updateScore")
    public String updateScore(Score score) {
        try {
            this.scoresService.modifyScore(score);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    /*删除成绩*/
    @GetMapping("/deleteScore")
    public String deleteScore(Integer id) {
        try {
            this.scoresService.dropScoreById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }
}
