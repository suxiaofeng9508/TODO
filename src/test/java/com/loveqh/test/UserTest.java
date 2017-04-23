package com.loveqh.test;

import com.loveqh.dao.UserDao;
import com.loveqh.pojo.User;
import com.loveqh.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by WL on 2017-04-23.
 */
public class UserTest {

    public void findUserById(int id) {
        SqlSessionFactory sessionFactory = MyBatisSessionFactory.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.findUserById(id);
        System.out.println(user);
        session.close();
    }

    public static void main(String[] args) {
        UserTest test = new UserTest();
        test.findUserById(1);
    }
}
