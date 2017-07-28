package com.dzzxjl.dao;

import com.dzzxjl.pojo.Article;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    //只获取标题
    @Select("select title from article")
    List<Article> selectAll();
}