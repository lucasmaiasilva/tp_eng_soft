/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tp_eng_soft.Eletrodomestico;


/**
 *
 * @author gsnasc
 */
public class Eletrodomestico_DAO {
    
void adEletrodomestico(Eletrodomestico eletrodomestico){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.save(eletrodomestico);
    t.commit();
    
}    

void removeEletrodomestico(Eletrodomestico eletrodomestico){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.delete(eletrodomestico);
    t.commit();
}
 
void updateEletrodomestico(Eletrodomestico eletrodomestico){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.update(eletrodomestico);
    t.commit();
}
    
}
