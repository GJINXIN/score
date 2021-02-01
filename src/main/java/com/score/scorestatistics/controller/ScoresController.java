package com.score.scorestatistics.controller;

import com.github.pagehelper.PageHelper;
import com.score.scorestatistics.dto.ResultDTO;
import com.score.scorestatistics.pojo.Score;
import com.score.scorestatistics.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoresController {

    @Autowired
    private ScoresService scoresService;

    /*添加成绩*/
    @PostMapping("/addScore")
    public ResultDTO addScore(@RequestBody Score score) {
        this.scoresService.addScores(score);
        return ResultDTO.success();
    }

    /*查询所有成绩*/
    @GetMapping("/findScoreAll")
    public ResultDTO findScoreAll(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Score> list = this.scoresService.findScoreAll();
        return ResultDTO.success().add("scorns", list);
    }

    /*更新成绩*/
    @PostMapping("/updateScore")
    public ResultDTO updateScore(@RequestBody Score score) {
        this.scoresService.modifyScore(score);
        return ResultDTO.success();
    }

    /*删除成绩*/
    @GetMapping("/deleteScore")
    public ResultDTO deleteScore(@RequestBody Integer id) {
        this.scoresService.dropScoreById(id);
        return ResultDTO.success();
    }
}
