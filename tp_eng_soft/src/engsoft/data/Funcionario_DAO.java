/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import engsoft.control.Funcionario;


/**
 *
 * @author gsnasc
 */
public class Funcionario_DAO {//Responsavel pela inserção dos atributos da classe funcionario a sua respectiva tabela no banco de dados
    
public void adFuncionario(Funcionario funcionario){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.persist(funcionario);
    manager.getTransaction().commit();
    manager.close(); 
    
}    

public void removeFuncionario(Funcionario funcionario){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.remove(funcionario);
    manager.getTransaction().commit();
    manager.close();
    
 
}
 
public void updateFuncionario(Funcionario funcionario){
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("engsoft");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.merge(funcionario);
    manager.getTransaction().commit();
    manager.close();
    
    
}
    
    
}
