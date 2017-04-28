package com.loveqh.todo.test.dao;

import com.loveqh.todo.dao.ProjectDao;
import com.loveqh.todo.pojo.Project;
import com.loveqh.todo.util.MyBatisSessionFactory;
import com.loveqh.todo.util.MyDateUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by WL on 2017-04-24.
 */
public class ProjectTest {

    private SqlSession session;
    private ProjectDao projectDao;

    @Before
    public void setUp() {
        SqlSessionFactory sessionFactory = MyBatisSessionFactory.getSessionFactory();
        session = sessionFactory.openSession();
        projectDao = session.getMapper(ProjectDao.class);
    }

    @Test
    public void getAllProjectsCount() {
        int count = projectDao.getAllProjectsCount();
        Assert.assertNotEquals(count, 0);
        System.out.println(count);
    }

    @Test
    public void findProjectById() {
        int id = 2;
        Project project = projectDao.findProjectById(id);
        Assert.assertNotNull(project);
        Assert.assertEquals(project.getId(), id);
        System.out.println(project);
    }

    @Test
    public void findAllProjects() {
        List<Project> projects = projectDao.findAllProjects();
        Assert.assertNotEquals(projects.size(), 0);
        for(Project project : projects) {
            System.out.println(project);
        }
    }

    @Test
    public void findProjectsLikeIntro() {
        String intro = "project";
        List<Project> projects = projectDao.findProjectsLikeIntro(intro);
        Assert.assertFalse(projects.isEmpty());
        for(Project project : projects) {
            System.out.println(project);
        }
    }

    @Test
    public void addProject() {
        int idx = projectDao.getAllProjectsCount();
        Project project = new Project();
        project.setIntro("todo " + idx);
        project.setCreateTime("today");
        Date today = new Date();
        project.setCreateTime(MyDateUtil.formatDateToString(today));
        project.setDeadline(MyDateUtil.formatDateToString(MyDateUtil.getDateByDelta(today, 1)));
        int count = projectDao.addProject(project);
        session.commit();
        Assert.assertEquals(count, 1);
    }

    @Test
    public void deleteProjectById() {
        int id = 4;
        int count = projectDao.deleteProjectById(id);
        session.commit();
        Assert.assertEquals(count, 1);
    }

    @Test
    public void updateProject() {
        int id = 3;
        Project project = new Project();
        project.setId(id);
        project.setIntro("update project");
        project.setDeadline(MyDateUtil.formatDateToString(MyDateUtil.getDateByDelta(new Date(), 1)));
        int count = projectDao.updateProject(project);
        session.commit();
        Assert.assertEquals(count, 1);
    }

    @After
    public void tearDown() {
        session.close();
    }
}
