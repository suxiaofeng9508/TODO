package com.loveqh.todo.dao;

import com.loveqh.todo.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by WL on 2017-04-23.
 */

//@MapperScan
@Repository
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
