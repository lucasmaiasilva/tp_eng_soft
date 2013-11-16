/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tp_eng_soft.Cliente;

/**
 *
 * @author gsnasc
 */
public class Cliente_DAO {
    
public void adCliente(Cliente cliente){
    
Session session = HibernateUtil.getSessionFactory().getCurrentSession();
Transaction t = session.beginTransaction();
session.save(cliente);
t.commit();    
 
}    

public void removeCliente(Cliente cliente){

Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
session.delete(cliente);
t.commit();    

}
 
public void updateCliente(Cliente cliente){
    
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
session.update(cliente);
t.commit();    
    
}


}

