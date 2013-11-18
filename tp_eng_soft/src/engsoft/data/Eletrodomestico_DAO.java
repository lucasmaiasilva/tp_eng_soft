/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.data;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;
import engsoft.control.Eletrodomestico;


/**
 *
 * @author gsnasc
 */
public class Eletrodomestico_DAO {
    
public void adEletrodomestico(Eletrodomestico eletrodomestico){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.persist(eletrodomestico);
    manager.getTransaction().commit();
    manager.close(); 
    
}    

public void removeEletrodomestico(Eletrodomestico eletrodomestico){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.remove(eletrodomestico);
    manager.getTransaction().commit();
    manager.close(); 
}
 
public void updateEletrodomestico(Eletrodomestico eletrodomestico){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.merge(eletrodomestico);
    manager.getTransaction().commit();
    manager.close(); 
}
    
}
