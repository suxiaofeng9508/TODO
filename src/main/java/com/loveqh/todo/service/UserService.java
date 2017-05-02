package com.loveqh.todo.service;

import com.loveqh.todo.pojo.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

/**
 * Created by WL on 2017-04-28.
 */

@Repository
public interface UserService {

    boolean login(String username, String password);

    User getUserById(int id);

    User getUserByName(String name);

    int save(User user);
}
