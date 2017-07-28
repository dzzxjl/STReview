package com.dzzxjl.controller;

import com.dzzxjl.pojo.User;
import com.dzzxjl.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //传入的是IUserService，因此只要是实现了IUserService的都可以
    /**
     * UserController并不知道注入的是哪个userServoice
     */
    @Resource
    private IUserService userService;

    @RequestMapping("/addUser")
    public String addUser(HttpServletRequest request, Model model){
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        int age = Integer.parseInt(request.getParameter("age"));

        User user = new User();

        user.setUserName(user_name);
        user.setPassword(password);
        user.setAge(age);

        this.userService.addUser(user);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(HttpServletRequest request, Model model) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        this.userService.deleteUser(id);
        return "index";
    }

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
//        return "showUser";
        return user;
    }



    @RequestMapping("/showAll")
    public String showAll(HttpServletRequest request, Model model){

        List<User> list = this.userService.getAllUsers();
        model.addAttribute("list",list);
        System.out.println(list);
        return "showAll";
    }

    @RequestMapping("/test")
    public List showAll2(){
        return this.userService.getAllUsers();
    }
}
