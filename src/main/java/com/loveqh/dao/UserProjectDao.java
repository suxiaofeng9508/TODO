package com.loveqh.dao;

import java.util.List;

/**
 * Created by WL on 2017-04-25.
 */
public interface UserProjectDao {

    int addUserProject(int userId, int projectId);

    List<Integer> getAllProjectsIdOfUser(int userId);

    int deleteProjectOfUser(int userId, int projectId);

    int deleteAllProjectsOfUser(int userId);
}
