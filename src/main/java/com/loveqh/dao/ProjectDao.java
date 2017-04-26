package com.loveqh.dao;

import com.loveqh.pojo.Project;

import java.util.List;

/**
 * Created by WL on 2017-04-24.
 */
public interface ProjectDao {

    int getAllProjectsCount();

    Project findProjectById(int id);

    List<Project> findProjectsLikeIntro(String intro);

    List<Project> findAllProjects();

    /**
     * TODO: change to update the finish state of the project
     * @param id
     * @return
     */
    int deleteProjectById(int id);

    int addProject(Project project);

    int updateProject(Project project);
}
