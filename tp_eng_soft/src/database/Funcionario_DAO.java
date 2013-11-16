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
    
void adFuncionario(Funcionario funcionario){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.save(funcionario);
    t.commit();
    
}    

void removeFuncionario(Funcionario funcionario){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.delete(funcionario);
    t.commit();
    
 
}
 
void updateFuncionario(Funcionario funcionario){
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    session.update(funcionario);
    t.commit();
    
}
    
    
}
