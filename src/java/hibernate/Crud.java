/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import pojo.Employee;

/**
 *
 * @author Mohammmed Sami
 */
public class Crud {

    public void insertEmployee(Employee emp) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

        } catch (HibernateException h) {
            session.getTransaction().rollback();
            h.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

    }

    public void updateEmployee(Employee emp) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {

            session.beginTransaction();
            


            session.update(emp);
            session.getTransaction().commit();

        } catch (HibernateException h) {
            session.getTransaction().rollback();
            h.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
    
    public List<Employee> selectEmployee(String letter) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {

            session.beginTransaction();
            
            Criteria c = session.createCriteria(Employee.class);
            
            c.add(Restrictions.ilike("lastName", letter, MatchMode.ANYWHERE));
            
            List<Employee> empList = c.list();
            return empList;
            
        } catch (HibernateException h) {
            session.getTransaction().rollback();
            h.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }

}
