package com.loveqh.dao;

import com.loveqh.pojo.User;

/**
 * Created by WL on 2017-04-23.
 */
public interface UserDao {

    User findUserById(int id);
}
