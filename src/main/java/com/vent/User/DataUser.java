package com.vent.User;

import com.vent.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DataUser {

    public static void insertUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(user);
            transaction.commit();
        }catch (Exception exception){
            transaction.rollback();
            throw exception;
        }
    }
    public static void updateUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.merge(user);
            transaction.commit();
        }catch (Exception exception){
            transaction.rollback();
            throw exception;
        }
    }

    public static User getUser(String username, String psw){

        User user = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            String query = "SELECT * FROM Users WHERE username=:username AND psw=:psw";
            user = session.createNativeQuery(query, User.class)
                    .setParameter("username", username)
                    .setParameter("psw", psw)
                    .uniqueResult();
        }catch (Exception e){
            return null;
        }
        return user;
    }
    public static boolean isExistUser(String username) throws Exception{
        User user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String query = "SELECT * FROM Users WHERE username=:username";
            user = session.createNativeQuery(query, User.class)
                    .setParameter("username", username)
                    .uniqueResult();
        }catch (Exception e){
            return true;
        }
        return user != null;
    }
}
