package com.loveqh.todo.dao;

import com.loveqh.todo.pojo.Step;

import java.util.List;

/**
 * Created by WL on 2017-04-26.
 */
public interface StepDao {

    int getAllStepsCount();

    Step findStepById(int id);

    List<Step> findStepsLikeIntro(String intro);

    List<Step> findAllSteps();

    int deleteStepById(int id);

    int deleteAllSteps();   //用于测试

    int addStep(Step step);

    int updateStep(Step step);
}
