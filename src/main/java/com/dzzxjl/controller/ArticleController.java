package com.dzzxjl.controller;

import com.dzzxjl.dao.ArticleDao;
import com.dzzxjl.dao.UserDao;
import com.dzzxjl.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;
    @RequestMapping("/add")
    public String addArticle(String title,String content,Model model){
        Article article = new Article(title, content);
        this.articleDao.insert(article);

        List<Article> list = this.articleDao.selectAll();
        model.addAttribute("articlelist",list);
        System.out.println(list);
        return "articles";
    }
}
