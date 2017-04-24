package com.loveqh.test;

import com.loveqh.dao.UserDao;
import com.loveqh.pojo.User;
import com.loveqh.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by WL on 2017-04-23.
 */
public class UserTest {

    private SqlSession session;
    private UserDao userDao;

    @Before
    public void setUp() {
        SqlSessionFactory sessionFactory = MyBatisSessionFactory.getSessionFactory();
        session = sessionFactory.openSession();
        userDao = session.getMapper(UserDao.class);
    }

    @Test
    public void getAllUsersCount() {
        int count = userDao.getAllUsersCount();
        Assert.assertNotEquals(count, 0);
    }

    @Test
    public void findUserById() {
        int id = 1;
        User user = userDao.findUserById(id);
        System.out.println(user);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), id);
    }

    @Test
    public void findUserByName() {
        String name = "wangl";
        User user = userDao.findUserByName(name);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getName(), name);
    }

    @Test
    public void findUsersLikeName() {
        String name = "wangl";
        List<User> users = userDao.findUsersLikeName(name);
        Assert.assertFalse(users.isEmpty());
        for(User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void findAllUsers() {
        List<User> users = userDao.findAllUsers();
        Assert.assertFalse(users.isEmpty());
        for(User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void deleteUserById() {
        int id = 2;
        int count = userDao.deleteUserById(id);
        session.commit();
        Assert.assertEquals(count, 1);
        findAllUsers();
    }

    @Test
    public void addUser() {
        int index = userDao.getAllUsersCount();
        User user = new User();
        user.setName("test" + index);
        user.setPassword("pass");
        user.setEmail("test@test.com");
        int count = userDao.addUser(user);
        session.commit();
        Assert.assertEquals(count, 1);
        findAllUsers();
    }

    @Test
    public void updateUser() {
        int id = 5;
        User user = userDao.findUserById(id);
        user.setName("55555");
        user.setPassword("2333333");
        user.setEmail("55@55.com");
        int count = userDao.updateUser(user);
        session.commit();
        Assert.assertEquals(count, 1);
        findAllUsers();
    }

    @After
    public void tearDown() {
        session.close();
    }
}
