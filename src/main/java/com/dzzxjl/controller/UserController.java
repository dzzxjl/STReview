package com.dzzxjl.controller;

import com.dzzxjl.pojo.User;
import com.dzzxjl.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.cs.US_ASCII;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
//        return "showUser";
        return user;
    }

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

    @RequestMapping("/showAll")
    public String showAll(HttpServletRequest request, Model model){

//        List<User> list = new ArrayList<User>();
//        User user = this.userService.getUserById(1);
//        User user1 = this.userService.getUserById(2);
//        list.add(user);
//        list.add(user1);
        List<User> list = this.userService.getAllUsers();
        model.addAttribute("list",list);
//        model.addAttribute("user", user);

        return "showAll";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(HttpServletRequest request, Model model) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        this.userService.deleteUser(id);
        return "index";
    }
}
