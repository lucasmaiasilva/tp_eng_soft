/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tp_eng_soft.Peca;


/**
 *
 * @author gsnasc
 */
public class Peca_DAO {
    
public void adPeca(Peca peca){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.persist(peca);
    manager.getTransaction().commit();
    manager.close();
    
}    

void removePeca(Peca peca){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.remove(peca);
    manager.getTransaction().commit();
    manager.close();
    
 
}
 
void updatePeca(Peca peca){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.merge(peca);
    manager.getTransaction().commit();
    manager.close();    
}

    
}
