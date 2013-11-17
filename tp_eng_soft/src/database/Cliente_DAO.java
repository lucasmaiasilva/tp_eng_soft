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
import tp_eng_soft.Cliente;

/**
 *
 * @author gsnasc
 */
public class Cliente_DAO {
    
public void adCliente(Cliente cliente){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.persist(cliente);
    manager.getTransaction().commit();
    manager.close();  
 
}    

public void removeCliente(Cliente cliente){

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.remove(cliente);
    manager.getTransaction().commit();
    manager.close();    

}
 
public void updateCliente(Cliente cliente){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.merge(cliente);
    manager.getTransaction().commit();
    manager.close();    
    
}


}

