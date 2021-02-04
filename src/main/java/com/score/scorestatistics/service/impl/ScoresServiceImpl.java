package com.score.scorestatistics.service.impl;

import com.score.scorestatistics.mapper.ScoreMapper;
import com.score.scorestatistics.pojo.Score;
import com.score.scorestatistics.pojo.ScoreExample;
import com.score.scorestatistics.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*成绩管理业务层*/
@Service
public class ScoresServiceImpl implements ScoresService {
    @Autowired
    private ScoreMapper scoreMapper;

    /*添加成绩*/
    @Override
    public void addScores(Score score) {
        this.scoreMapper.insert(score);
    }

    /*查询全部成绩*/
    @Override
    public List<Score> findScoreAll() {
        ScoreExample example = new ScoreExample();
        return this.scoreMapper.selectByExample(example);
    }

    /*更新成绩*/
    @Override
    @Transactional
    public void modifyScore(Score score) {
        this.scoreMapper.updateByPrimaryKey(score);
    }

    /*删除操作*/
    @Override
    @Transactional
    public void dropScoreById(Integer id) {
        this.scoreMapper.deleteByPrimaryKey(id);
    }

    /*根据id获取单个成绩*/
    @Override
    public Score getScore(Integer id) {
        return this.scoreMapper.selectByPrimaryKey(id);
    }
}
