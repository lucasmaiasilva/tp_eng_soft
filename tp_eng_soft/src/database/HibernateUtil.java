/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Lucas
 */
public class HibernateUtil {

    private static final EntityManagerFactory factory;
    private static final EntityManager manager;
    
    
    static {
        try {
            
            factory = Persistence.createEntityManagerFactory("engsoft");
            manager = factory.createEntityManager();
            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static EntityManagerFactory getManager() {
        return factory;
    }
}
