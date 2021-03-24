package org.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.entity.Department;
import org.hibernate.entity.Detail;
import org.hibernate.entity.Employee;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // SessionFactory - фабрика по производству сессий
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")  // чтение файла hibernate.cfg.xml => sessionFactory знает как должны создаваться сессии
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession(); // Session - обертка вокруг подключения к базе с помощью JDBC
            session.beginTransaction();
            session.getTransaction().commit();


        }
        finally {
            session.close();
            factory.close();
        }
    }
}
