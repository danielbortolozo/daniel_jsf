
package br.com.maven.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 *
 * @author daniel
 */
public class HibernateUtil {

    private static final SessionFactory sessionfactory;
    public static final String HIBERNATE_SESSION = "Hibernate_Session";

    
    
    
    static{
        try{
            System.out.println("Tentando abrir uma SessionFactory"); 
            Configuration configuration = new Configuration().configure(); 
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            
            sessionfactory = configuration.buildSessionFactory(serviceRegistry);
            System.out.println("Ok, SessionFactory Configurada Corretamente!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao inicial a sesssionFactory"+e.getMessage());
            throw new ExceptionInInitializerError(e);
            
        }
        
        
        
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }
    
    
    
    
    
}
