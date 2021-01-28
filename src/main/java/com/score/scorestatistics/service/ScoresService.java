package com.score.scorestatistics.service;

import com.score.scorestatistics.pojo.Score;

import java.util.List;

public interface ScoresService {
    void addScores(Score score);

    List<Score> findScoreAll();

    Score preUpdateScore(Integer id);

    void modifyScore(Score score);

    void dropScoreById(Integer id);

}
