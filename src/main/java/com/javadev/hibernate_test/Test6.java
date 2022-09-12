package com.javadev.hibernate_test;

import com.javadev.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test6 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
           // Employee emp = new Employee("Rick", "Vos", "HR", 900);

            Session session = factory.getCurrentSession();
            session.beginTransaction();
          //  session.save(emp);

            session.createQuery("delete Employee where name = 'Rick' and salary > '1000'")
                            .executeUpdate();


            session.getTransaction().commit();

        }

        finally {
            factory.close();
        }
    }

}
