package com.dzzxjl.service;

import com.dzzxjl.pojo.User;

import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
public interface IUserService {
    User getUserById(int userId);
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser(int userId);
}
