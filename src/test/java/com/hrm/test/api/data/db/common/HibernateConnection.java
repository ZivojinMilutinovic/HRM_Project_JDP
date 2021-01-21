package com.hrm.test.api.data.db.common;

import com.hrm.test.api.data.db.model.Example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateConnection {

    public static void main(String[] args) {
        SessionFactory factory = Config.exampleDB().addAnnotatedClass(Example.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            Example example = session.get(Example.class, 160);
            String user = example.getUser();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
