package com.vent.Cmd;

import com.vent.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class DataCmd {

    public static void insertCmd(Cmd cmd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            // Insert new Cmd to Commandes Table
            session.merge(cmd);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        }
    }
    public static Cmd getCmd(String idCmd){
        Cmd cmd;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String queryStr = "SELECT * FROM Commands WHERE codeCmd=:idCmd";
            cmd = session.createNativeQuery(queryStr, Cmd.class).setParameter("idCmd", idCmd).uniqueResult();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return cmd;
    }
}
