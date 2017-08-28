package com.dzzxjl.service.impl;

import com.dzzxjl.dao.UserDao;
import com.dzzxjl.pojo.User;
import com.dzzxjl.service.IUserService;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
@Service
public class UserServiceImpl implements IUserService {
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
        return userDao.getAllUsers();
    }

    //    public List<User> getAllUsers() {
//        MongoClient client = new MongoClient("localhost",27017);
//        MongoDatabase mongoDatabase = client.getDatabase("test");
//        MongoCollection<Document> collection = mongoDatabase.getCollection("newcoll");
//        FindIterable<Document> findIterable = collection.find();
//        MongoCursor mongoCursor = findIterable.iterator();
//        long total = collection.count();
//        System.out.println(total);
//        List list = new ArrayList();
//        while (mongoCursor.hasNext()){
////            System.out.println(mongoCursor.next());
//            list.add(mongoCursor.next());
//        }
//        return list;
//    }
}
