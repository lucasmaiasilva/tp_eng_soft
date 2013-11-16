/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import tp_eng_soft.Peca;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gsnasc
 */
public class Peca_DAO {
    
public void adPeca(Peca peca){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.save(peca);
    t.commit();
    
}    

void removePeca(Peca peca){
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.delete(peca);
    t.commit();
    
    
 
}
 
void updatePeca(Peca peca){
Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.update(peca);
    t.commit();    
}

    
}
