package com.vent.Cmd;

import com.vent.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DataCmd {

    public void insertCmd(List<Cmd> cmd){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            // Insert new Cmd to Commandes Table
            session.save(cmd);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
    }
    public List<Cmd> getCmd(int idCmd){
        List<Cmd> cmds = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String queryStr = "SELECT * FROM Commands WHERE codeCmd=:idCmd";
            cmds = session.createNativeQuery(queryStr, Cmd.class).setParameter("idCmd", idCmd).list();
        }catch (Exception e){

        }
        return cmds;
    }
}
