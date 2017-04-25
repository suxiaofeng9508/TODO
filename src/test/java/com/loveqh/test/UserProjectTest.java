package com.loveqh.test;

import com.loveqh.dao.UserProjectDao;
import com.loveqh.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by WL on 2017-04-25.
 */
public class UserProjectTest {

    private SqlSession session;
    private UserProjectDao userProjectDao;

    @Before
    public void setUp() {
        SqlSessionFactory sessionFactory = MyBatisSessionFactory.getSessionFactory();
        session = sessionFactory.openSession();
        userProjectDao = session.getMapper(UserProjectDao.class);
    }

    @Test
    public void addUserProject() {

    }

    @After
    public void tearDown() {
        session.close();
    }
}
