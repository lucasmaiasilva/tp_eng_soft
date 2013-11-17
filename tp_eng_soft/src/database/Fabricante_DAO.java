/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tp_eng_soft.Fabricante;

/**
 *
 * @author gsnasc
 */
public class Fabricante_DAO {
    
public void adFabricante(Fabricante fabricante){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.persist(fabricante);
    manager.getTransaction().commit();
    manager.close(); 
    
}    

public void removeFabricante(Fabricante fabricante){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.remove(fabricante);
    manager.getTransaction().commit();
    manager.close(); 
    
}
 
public void updateFabricante(Fabricante fabricante){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.merge(fabricante);
    manager.getTransaction().commit();
    manager.close(); 
    
    
}
    
}
