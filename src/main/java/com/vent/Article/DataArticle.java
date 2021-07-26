package com.vent.Article;

import com.vent.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class DataArticle {
    public static List<Article> getArticles(String gender) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        String query = "SELECT * FROM Articles WHERE genderArt=:gender";
        return session.createNativeQuery(query, Article.class)
                .setParameter("gender", gender).list();
    }

    public void insertArticle(){

    }

    public static List<Article> getAllArticle(){
        Session session = HibernateUtil.getSessionFactory().openSession();

        String query = "SELECT * FROM Articles";
        return session.createNativeQuery(query, Article.class).list();

    }

}
