package com.loveqh.dao;

import com.loveqh.pojo.Step;

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

    int addStep(Step step);

    int updateStep(Step step);
}
