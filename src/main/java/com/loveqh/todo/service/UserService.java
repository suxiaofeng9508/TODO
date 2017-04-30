package com.loveqh.todo.service;

import com.loveqh.todo.pojo.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

/**
 * Created by WL on 2017-04-28.
 */

@Repository
public interface UserService {

    boolean login(User user);

    User getUserById(int id);

    int save(User user);
}
