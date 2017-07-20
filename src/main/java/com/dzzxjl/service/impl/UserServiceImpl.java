package com.dzzxjl.service.impl;

import com.dzzxjl.dao.IUserDao;
import com.dzzxjl.pojo.User;
import com.dzzxjl.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

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
