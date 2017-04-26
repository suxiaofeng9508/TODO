package com.loveqh.test;

import com.loveqh.dao.StepDao;
import com.loveqh.pojo.Step;
import com.loveqh.util.MyBatisSessionFactory;
import com.loveqh.util.MyDateUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by WL on 2017-04-26.
 */
public class StepTest {

    private SqlSession session;
    private StepDao stepDao;

    @Before
    public void setUp() {
        SqlSessionFactory sessionFactory = MyBatisSessionFactory.getSessionFactory();
        session = sessionFactory.openSession();
        stepDao = session.getMapper(StepDao.class);
    }

    @Test
    public void getAllStepsCount() {
        int count = stepDao.getAllStepsCount();
        Assert.assertNotEquals(count, 0);
        System.out.println(count);
    }

    @Test
    public void findStepById() {
        int stepId = 2;
        Step step = stepDao.findStepById(stepId);
        Assert.assertNotNull(step);
        Assert.assertEquals(step.getId(), stepId);
        System.out.println(step);
    }

    @Test
    public void findStepsLikeIntro() {
        String intro = "step";
        List<Step> steps = stepDao.findStepsLikeIntro(intro);
        Assert.assertFalse(steps.isEmpty());
        for(Step step : steps) {
            System.out.println(step);
        }
    }

    @Test
    public void findAllSteps() {
        List<Step> steps = stepDao.findAllSteps();
        Assert.assertFalse(steps.isEmpty());
        for(Step step : steps) {
            System.out.println(step);
        }
    }

    @Test
    public void addStep() {
        int projectId = 2;
        Step step = new Step();
        step.setIntro("first step");
        Date now = new Date();
        step.setCreateTime(MyDateUtil.formatDateToString(now));
        step.setDeadline(MyDateUtil.formatDateToString(MyDateUtil.getDateByDelta(now, 2)));
        step.setProjectId(projectId);
        int count = stepDao.addStep(step);
        session.commit();
        Assert.assertEquals(count, 1);
    }

    @Test
    public void deleteStepById() {
        int stepId = 2;
        int count = stepDao.deleteStepById(stepId);
        session.commit();
        Assert.assertEquals(count, 1);
    }

    @Test
    public void updateStep() {
        int stepId = 2;
        Step step = new Step();
        step.setId(stepId);
        step.setIntro("first step update");
        int count = stepDao.updateStep(step);
        session.commit();
        Assert.assertEquals(count, 1);
    }

    @After
    public void tearDown() {
        session.close();
    }
}
