package com.dzzxjl.service;

import com.dzzxjl.pojo.User;
import com.dzzxjl.service.impl.IUserServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 以接口的形式可以方便后期修改，直接再去实现接口中的方法新写一个类就可以了
 */
@Service
public class UserService2 implements IUserServiceImpl {
    public User getUserById(int userId) {
        return null;
    }

    public void addUser(User user) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void deleteUser(int userId) {

    }
}
