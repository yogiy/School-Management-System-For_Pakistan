/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.dao;

import com.school.log.AppLog;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.AggregateProjection;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.SimpleExpression;

/**
 *
 * @author JAY KUMAR
 */
public class DatabaseManager {

    public static List getData(Class c){
        Session session = openSession();
        List list = null;
        try{
            Criteria cr = session.createCriteria(c);
            list = cr.list();
        } finally {
            session.close();
        }
        return list;
    }
    
    public static List getData(Class c, Order order){
        Session session = openSession();
        List list = null;
        try{
            Criteria cr = session.createCriteria(c);
            cr.addOrder(order);
            list = cr.list();
        } finally {
            session.close();
        }
        return list;
    }
    
     public static List getData(Class c, SimpleExpression exp){
        Session session = openSession();
        List list = null;
        try{
            Criteria cr = session.createCriteria(c);
            cr.add(exp);
            list = cr.list();
        } finally {
            session.close();
        }
        return list;
    }
    
    public static List getData(Class c,SimpleExpression... exp){
        Session session = openSession();
        List list = null;
        try{
            Criteria cr = session.createCriteria(c);
            for(int i=0;i<exp.length;i++){
                cr.add(exp[i]);
            }
            list = cr.list();
        } finally {
            session.close();
        }
        return list;
    } 
     
    public static List getData(Class c, Order order, Criterion... exp){
        Session session = openSession();
        List list = null;
        try{
            Criteria cr = session.createCriteria(c);
            for(int i=0;i<exp.length;i++){
                cr.add(exp[i]);
            }
            cr.addOrder(order);
            list = cr.list();
        } finally {
            session.close();
        }
        return list;
    } 

    public static List getData(Class c, AggregateProjection projection){
        Session session = openSession();
        List list = null;
        try{
            Criteria cr = session.createCriteria(c)
            .setProjection(projection);
            list = cr.list();
        } finally {
            session.close();
        }
        return list;
    }
    
    public static List getData(String hql) throws HibernateException {
        Session session = openSession();
        Transaction trancaction = null;
        try {
            trancaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            List list = query.list();
            trancaction.commit();
            return list;
        } catch (HibernateException he) {
            if (trancaction != null) {
                trancaction.rollback();
            }
            throw he;
        }finally{
            session.close();
        }
    }

    public static List getData(String className, String where, String orderBy) throws HibernateException {
        Session session = openSession();
        Transaction trancaction = null;
        try {
            trancaction = session.beginTransaction();
            String hql = (new StringBuilder()).append(" FROM ").append(className).append(" WHERE ").append(where).append(" ORDER BY ").append(orderBy).toString();
            Query query = session.createQuery(hql);
            List list = query.list();
            trancaction.commit();
            return list;
        } catch (HibernateException he) {
            if (trancaction != null) {
                trancaction.rollback();
            }
            throw he;
        }finally{
            session.close();
        }
    }

    public static Object addData(Object object) throws HibernateException {
        Session session = openSession();
        Transaction trancaction = null;
        try {
            trancaction = session.beginTransaction();
            Object id = session.save(object);
            trancaction.commit();
            return id;
        } catch (HibernateException he) {
            if (trancaction != null) {
                trancaction.rollback();
            }
     
            throw he;
        }finally{
            session.close();
        }
    }

    public static void updateData(Object object) throws HibernateException {
        Session session = openSession();
        Transaction trancaction = null;
        try {
            trancaction = session.beginTransaction();
            session.update(object);
            trancaction.commit();
        } catch (HibernateException he) {
            if (trancaction != null) {
                trancaction.rollback();
            }
         
            throw he;
        }finally{
            session.close();
        }
    }

    public static int deleteData(Class clas, int id) throws HibernateException {
        Session session = openSession();
        Transaction trancaction = null;
        try {
            trancaction = session.beginTransaction();
            session.delete(session.get(clas, id));
            trancaction.commit();
        } catch (HibernateException he) {
            if (trancaction != null) {
                trancaction.rollback();
            }
  
            throw he;
        }finally{
            session.close();
        }
        return 0;
    }

    public static int deleteData(Object ob) throws HibernateException {
        Session session = openSession();
        Transaction trancaction = null;
        try {
            trancaction = session.beginTransaction();
            session.delete(ob);
            trancaction.commit();
        } catch (HibernateException he) {
            if (trancaction != null) {
                trancaction.rollback();
            }
            Logger.getLogger(AppLog.ERROR_LOG).log(Level.SEVERE, "Hibernate Exception", he);
            throw he;
        }finally{
            session.close();
        }
        return 0;
    }
    
    
    protected static Session openSession(){
        return HibernateUtil.getSessionFactory().openSession();
    }
}
