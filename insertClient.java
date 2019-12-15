package net.codejava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class insertClient {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        client addClient = new client();
        addClient.setClientFirstName("Blake");
        addClient.setClientLastName("Turley");
        addClient.setClientEmail("blake@gmail.com");

        session.save(addClient);
        transaction.commit();

        System.out.println("Items successfully added.");

    }
}