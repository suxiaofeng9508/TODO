package com.loveqh.dao;

import com.loveqh.pojo.User;

import java.util.List;

/**
 * Created by WL on 2017-04-23.
 */
public interface UserDao {

    int getAllUsersCount();

    User findUserById(int id);

    User findUserByName(String name);

    List<User> findUsersLikeName(String name);

    List<User> findAllUsers();

    int deleteUserById(int id);

    int addUser(User user);

    int updateUser(User user);
}
