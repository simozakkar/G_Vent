package com.vent.Action;


import com.opensymphony.xwork2.ActionSupport;
import com.vent.Article.Article;
import com.vent.Article.DataArticle;
import com.vent.User.DataUser;
import com.vent.User.User;

import java.util.List;

public class LoginUser extends ActionSupport {
    private String username;
    private String psw;
    private User user;

    private List<Article> articles = null;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String execute() throws Exception {
        this.user = DataUser.getUser(this.username, this.psw);
        if (this.user != null){
            this.articles = DataArticle.getAllArticle();
            return SUCCESS;
        }
        return ERROR;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
