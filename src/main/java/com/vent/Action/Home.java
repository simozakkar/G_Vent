package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.vent.Article.Article;
import com.vent.Article.DataArticle;

import java.util.List;

public class Home extends ActionSupport {

    private String gender;
    private List<Article> articles = null;

    @Override
    public String execute() throws Exception {
        if (this.gender != null && !this.gender.equals("A")){
            this.articles = DataArticle.getArticles(this.gender);
            return SUCCESS;
        }
        this.articles = DataArticle.getAllArticle();
        return SUCCESS;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
