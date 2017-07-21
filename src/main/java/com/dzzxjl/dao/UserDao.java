package com.dzzxjl.dao;

import com.dzzxjl.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by dzzxjl on 2017/7/18.
 */
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user_t")
    List<User> getAllUsers();
}
