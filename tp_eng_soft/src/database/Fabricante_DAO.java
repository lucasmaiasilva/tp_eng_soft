/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tp_eng_soft.Fabricante;

/**
 *
 * @author gsnasc
 */
public class Fabricante_DAO {
    
void adFabricante(Fabricante fabricante){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.save(fabricante);
    t.commit();
    
    
}    

void removeFabricante(Fabricante fabricante){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.delete(fabricante);
    t.commit();
    
}
 
void updateFabricante(Fabricante fabricante){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.update(fabricante);
    t.commit();
    
    
}
    
}