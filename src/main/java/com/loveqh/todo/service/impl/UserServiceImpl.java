package com.loveqh.todo.service.impl;

import com.loveqh.todo.dao.UserDao;
import com.loveqh.todo.pojo.User;
import com.loveqh.todo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by WL on 2017-04-28.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public boolean login(User user) {
        return false;
    }

    public User getUserById(int id) {
        return userDao.findUserById(id);
    }

    public int save(User user) {
        return userDao.addUser(user);
    }
}
