package com.dzzxjl.controller;

import com.dzzxjl.dao.UserDao;
import com.dzzxjl.pojo.User;
import com.dzzxjl.service.IUserService;
import com.dzzxjl.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
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



    @RequestMapping(value = "/showAll",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String showAll(HttpServletRequest request, Model model){

        List<User> list = this.userService.getAllUsers();
        User user = new User();
        user.setId(9);
        user.setUserName("脏");
        user.setAge(11);
        list.add(user);
        model.addAttribute("list",list);
        System.out.println(list);
//        System.out.println(list.get(0).getUserName());
        //此时拿到的Byte[]已经乱码
        String luanma = list.get(0).getUserName();
        try {
            String temp = new String(list.get(1).getUserName().getBytes("GBK"),"UTF-8");
            System.out.println(Arrays.toString(temp.getBytes()));
            System.out.println(temp);
            System.out.println(Arrays.toString(list.get(1).getUserName().getBytes()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

//        return list;
        String s = null;
        try {
            s = new String("在在".getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "你好";
    }

    @ResponseBody
    @RequestMapping("/test")
    public String showAll2(){
        return "中文";
    }


    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        List<User> list = userService.getAllUsers();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
