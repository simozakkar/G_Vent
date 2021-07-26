package com.vent.User;

import com.vent.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DataUser {

    public void insertUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.saveOrUpdate(user);
            transaction.commit();
        }catch (Exception exception){
            transaction.rollback();
        }
    }

    public static User getUser(String username, String psw){

        User user ;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String query = "SELECT * FROM Users WHERE userName=:username AND userPsw=:psw";
            user = session.createNativeQuery(query, User.class)
                    .setParameter("username", username)
                    .setParameter("psw", psw)
                    .getSingleResult();
        }catch (Exception e){
            return null;
        }
        return user;
    }
}
