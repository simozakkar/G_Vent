package com.vent.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.vent.Article.Article;
import com.vent.Article.DataArticle;

public class Product extends ActionSupport {

    private int idArt;
    private Article article;


    public int getIdArt() {
        return idArt;
    }

    public void setIdArt(int idArt) {
        this.idArt = idArt;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String execute() throws Exception {
        this.article = DataArticle.getArticle(this.idArt);
        if (this.article == null) return ERROR;
        return SUCCESS;
    }

}
