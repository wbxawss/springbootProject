package com.springboot.controller;

import com.springboot.model.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @作者：hawk
 * @日期：2021/1/13 0013 21:23
 */
@Controller
@RequestMapping("/")
public class testController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 登录验证
     * @param request
     * @return
     */
    @RequestMapping( value = "/doLogin")
    @ResponseBody
    public String doLogin(HttpServletRequest request){
        User user = new User();
        request.getSession().setAttribute("user", user);
        return "login success";
    }

    /**
     * 登录后展示主页
     * @return
     */
    @RequestMapping( value = "/show")
    @ResponseBody
    public String show(){
        return "show index page";
    }

    /**
     * 不需登录也可访问的方法
     * @return
     */
    @RequestMapping( value = "/nologin")
    @ResponseBody
    public String nologin(){
        return "no need login";
    }

}
