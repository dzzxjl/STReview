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

//    @Select("select * from user_t")
//    这种写法表中对应的列与pojo中的属性值无法一一对应，因此名称不一样的属性值将为null
    List<User> getAllUsers();
}
