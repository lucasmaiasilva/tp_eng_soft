/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import org.hibernate.Session;
import org.hibernate.Transaction;
import tp_eng_soft.Funcionario;

/**
 *
 * @author gsnasc
 */
public class Funcionario_DAO {
    
public void adFuncionario(Funcionario funcionario){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.save(funcionario);
    t.commit();
    
}    

public void removeFuncionario(Funcionario funcionario){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.delete(funcionario);
    t.commit();
    
 
}
 
public void updateFuncionario(Funcionario funcionario){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.update(funcionario);
    t.commit();
    
}
    
    
}
