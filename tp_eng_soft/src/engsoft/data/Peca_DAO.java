/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.data;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import engsoft.control.Peca;


/**
 *
 * @author gsnasc
 */
public class Peca_DAO {//Responsavel pela inserção dos atributos da classe peca a sua respectiva tabela no banco de dados
    
public void adPeca(Peca peca){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("eng_soft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.persist(peca);
    manager.getTransaction().commit();
    manager.close();
    
}    

void removePeca(Peca peca){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("eng_soft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.remove(peca);
    manager.getTransaction().commit();
    manager.close();
    
 
}
 
void updatePeca(Peca peca){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("eng_soft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.merge(peca);
    manager.getTransaction().commit();
    manager.close();    
}

    
}
