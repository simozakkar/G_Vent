package com.vent.Stock;

import com.vent.HibernateUtil;
import org.hibernate.Session;

public class DataStock {
    public static int getQuntity(int idArt){
        int qte;
            Session session = HibernateUtil.getSessionFactory("hibernateStock.cfg.xml").openSession();
        try{
            String query = "SELECT qteProd FROM produit_stock WHERE codeProd=:idArt";
            qte  = (int) session.createNativeQuery(query).setParameter("idArt", idArt).getSingleResult();
        }catch (Exception e){
            return -1;
        }
        return qte;
    }

    public int sustractionQte(int qte){
      int statu;
      try{
          Session session = HibernateUtil.getSessionFactory("hibernateStock.cfg.xml").openSession();
          return 0;
      }catch (Exception e){

      }
      return 0;
    }
}
