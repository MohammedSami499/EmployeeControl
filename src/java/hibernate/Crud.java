/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojo.Employee;

/**
 *
 * @author Mohammmed Sami
 */
public class Crud {
    
    public void insertEmployee(Employee emp){
        
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try{
            
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            
        }catch(HibernateException h){
            session.getTransaction().rollback();
            h.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        
    }
    
}
