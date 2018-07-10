package db;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;


    public class DBHelper {

        private static Transaction transaction;
        private static Session session;

        //    TODO: save method
        public static void save(Object object) {
            session = HibernateUtil.getSessionFactory().openSession();

            try {
                transaction = session.beginTransaction();
                session.save(object);
                transaction.commit();
            } catch (HibernateException e) {
                transaction.rollback();
                e.printStackTrace();
            } finally {
                session.close();
            }
        }

        //    TODO: Update method
        public static void update(Object object) {
            session = HibernateUtil.getSessionFactory().openSession();

            try {
                transaction = session.beginTransaction();
                session.update(object);
                transaction.commit();
            } catch (HibernateException e) {
                transaction.rollback();
                e.printStackTrace();
            } finally {
                session.close();
            }
        }

//    TODO: delete method

        public static void delete(Object object) {
            session = HibernateUtil.getSessionFactory().openSession();
            try {
                transaction = session.beginTransaction();
                session.delete(object);
                transaction.commit();
            } catch (HibernateException e) {
                transaction.rollback();
                e.printStackTrace();
            } finally {
                session.close();
            }
        }

        //    TODO: getAll method
//    we want getAll to return a list of generic things
//    public static TYPE List<TYPE> getAllClass(Class classType)
        public static <T> List<T> getAll(Class classType) {
            List<T> results = null;
            session = HibernateUtil.getSessionFactory().openSession();

            try {
                Criteria cr = session.createCriteria(classType);
                results = cr.list();
            } catch (HibernateException e) {
                e.printStackTrace();
            } finally {
                session.close();
            }
            return results;
        }

//    TODO: FindById method

        public static <T> T findById(Class classType, int id) {
            T result = null;
            session = HibernateUtil.getSessionFactory().openSession();
            try {
                Criteria cr = session.createCriteria(classType);
                cr.add(Restrictions.eq("id", id));
                result = (T)cr.uniqueResult();
            } catch (HibernateException e) {
                e.printStackTrace();
            } finally {
                session.close();
            }
            return result;
        }
    }

}
