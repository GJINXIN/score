package com.score.scorestatistics.service.impl;

import com.score.scorestatistics.mapper.ScoreMapper;
import com.score.scorestatistics.pojo.Score;
import com.score.scorestatistics.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*成绩管理业务层*/
@Service
public class ScoresServiceImpl implements ScoresService {
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public void addScores(Score scores) {
        this.scoreMapper.insert(scores);
    }
}
