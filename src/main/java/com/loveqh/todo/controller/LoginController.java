package com.loveqh.todo.controller;

import com.loveqh.todo.dao.UserDao;
import com.loveqh.todo.pojo.User;
import com.loveqh.todo.service.UserService;
import com.loveqh.todo.util.MyBatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by WL on 2017-04-27.
 */

@Controller
@RequestMapping(value = "/user")
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView index() {
        System.out.println("用户登录");
        User user = userService.getUserById(1);
//        不需要手动commit
//        user.setName("test_spring");
//        int count = userService.save(user);
//        System.out.println(count);
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public @ResponseBody String list() {
        return userService.getUserById(1).toString();
    }

}
