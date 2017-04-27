package com.loveqh.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by WL on 2017-04-27.
 */

@Controller
@RequestMapping(value = "/user")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        System.out.println("用户登录");
        return "index";
    }
}
