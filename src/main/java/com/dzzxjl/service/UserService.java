package com.dzzxjl.service;

import com.dzzxjl.dao.UserDao;
import com.dzzxjl.pojo.User;
import com.dzzxjl.service.impl.IUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
@Service
public class UserService implements IUserServiceImpl {
    //接口也可以注入吗？以下三种方式应该都可以
    @Autowired
    private UserDao userDao;

//    @Autowired
//    UserService(UserDao userDao){
//        this.userDao = userDao;
//    }
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

    public void addUser(User user) {
         this.userDao.insert(user);
    }

    public void deleteUser(int userId) {
        this.userDao.deleteByPrimaryKey(userId);
    }

    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }
}
