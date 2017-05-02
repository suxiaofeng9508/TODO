package com.loveqh.todo.service.impl;

import com.loveqh.todo.dao.UserDao;
import com.loveqh.todo.pojo.User;
import com.loveqh.todo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by WL on 2017-04-28.
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public boolean login(String username, String password) {
        User user = userDao.findUserByName(username);
        if(user == null) {
            return false;
        }
        if(user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public User getUserById(int id) {
        return userDao.findUserById(id);
    }

    public User getUserByName(String name) {
        return userDao.findUserByName(name);
    }

    public int save(User user) {
        return userDao.addUser(user);
    }
}
