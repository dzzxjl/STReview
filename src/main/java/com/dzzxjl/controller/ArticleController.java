package com.dzzxjl.controller;

import com.dzzxjl.dao.ArticleDao;
import com.dzzxjl.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.sound.midi.Soundbank;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;
    @RequestMapping("/add")
    public String addArticle(String title,String content,Model model){
//        Article article = new Article(title, content);
//        this.articleDao.insert(article);

        List<Article> list = this.articleDao.selectAll();
        model.addAttribute("articlelist",list);
        System.out.println(list);
        System.out.println(list.get(0).getContent());
        return "articles";
    }


    @RequestMapping("/test")
    @ResponseBody
    public Article test() {
        Article article = null;
        article = this.articleDao.selectByPrimaryKey(1);
        return article;
    }


    @ResponseBody
    @RequestMapping(value = "/show", produces="text/json;charset=utf-8")
    public List<Article> getAllArticles(Model model) {
        List<Article> list = this.articleDao.selectAll();
//        model.addAttribute("articlelist",list);
        for (Article article : list) {
            System.out.println(article.getId());
        }
        System.out.println(list);
//        System.out.println(list.get(1).getContent());

        try {
            String temp = new String(list.get(1).getContent().getBytes("GBK"),"UTF-8");
            System.out.println(temp);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        Article article = this.articleDao.selectByPrimaryKey(1);
//        System.out.println(article.getContent());
        return list;
    }

}
