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


    @RequestMapping("/text")
//    @ResponseBody
    public String test(String id, Model model) {
        Integer aid = Integer.parseInt(id);
        Article article = null;
        article = this.articleDao.selectByPrimaryKey(aid);
        model.addAttribute("article", article);
        return "article/text";
    }


//    @ResponseBody
    @RequestMapping(value = "/index", produces="text/json;charset=utf-8")
    public String getAllArticles(Model model) {
        List<Article> list = this.articleDao.selectAll();
        model.addAttribute("articlelist", list);
        return "article/index";
    }

}
