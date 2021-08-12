package com.vent.Stock;

import com.vent.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DataStock {
    public static int getQuntity(int idArt){
        int qte;
         Session session = HibernateUtil.getSessionFactory("hibernateStock.cfg.xml").openSession();
        try{
            String query = "SELECT qteProd FROM produit_stock WHERE codeProd=:idArt";
            qte  = (int) session.createNativeQuery(query).setParameter("idArt", idArt).uniqueResult();
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
        return qte;
    }

    public static Stock getStock(int idArt){
        try{
            Session session = HibernateUtil.getSessionFactory("hibernateStock.cfg.xml").openSession();
            String query = "SELECT * FROM produit_stock WHERE codeProd=:idArt";
            return session.createNativeQuery(query, Stock.class).setParameter("idArt", idArt).uniqueResult();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



    public static boolean sustractionQte(int idArt, int qteRequest){
      Session session = HibernateUtil.getSessionFactory("hibernateStock.cfg.xml").openSession();
      Transaction transaction = session.beginTransaction();
      try{
          Stock stock = getStock(idArt);
          if (stock == null || stock.getQteProd() < qteRequest) return false;
          stock.setQteProd(stock.getQteProd() - qteRequest);
          session.merge(stock);
          transaction.commit();
          return true;
      }catch (Exception e){
          transaction.rollback();
          e.printStackTrace();
          return false;
      }
    }
}
