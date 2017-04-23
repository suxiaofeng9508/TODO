package com.loveqh.test;

import com.loveqh.dao.UserDao;
import com.loveqh.pojo.User;
import com.loveqh.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by WL on 2017-04-23.
 */
public class UserTest {

    @Test
    public void findUserById() {
        SqlSessionFactory sessionFactory = MyBatisSessionFactory.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        int id = 1;
        User user = userDao.findUserById(id);
        session.close();
        System.out.println(user);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), id);
    }
}
