package com.loveqh.todo.test.dao;

import com.loveqh.todo.dao.UserDao;
import com.loveqh.todo.pojo.User;
import com.loveqh.todo.service.UserService;
import com.loveqh.todo.service.impl.UserServiceImpl;
import com.loveqh.todo.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by WL on 2017-04-23.
 */

//@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {

//    private SqlSession session;
    private UserDao userDao;
    @Resource
    private UserService userService;

//    @Before
//    public void setUp() {
//        SqlSessionFactory sessionFactory = MyBatisSessionFactory.getSessionFactory();
//        session = sessionFactory.openSession();
//        userDao = session.getMapper(UserDao.class);
//    }

    @Test
    public void getAllUsersCount() {
        int count = userDao.getAllUsersCount();
        Assert.assertNotEquals(count, 0);
    }

    @Test
    public void findUserById() {
        int id = 1;
        System.out.println(userService);
        User user = userService.getUserById(id);
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
        System.out.println(users);
        for(User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void deleteUserById() {
        int id = 2;
        int count = userDao.deleteUserById(id);
//        session.commit();
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
//        session.commit();
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
//        session.commit();
        Assert.assertEquals(count, 1);
        findAllUsers();
    }

//    @After
//    public void tearDown() {
//        session.close();
//    }
}
