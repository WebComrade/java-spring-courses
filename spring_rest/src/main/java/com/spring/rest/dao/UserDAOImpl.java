package com.spring.rest.dao;

import com.spring.rest.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void deleteAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> userList = getAllUsers();
        for(User user: userList){
            session.delete(user);
        }
    }

    @Override
    public void deleteUser(int id) {
        Session session = sessionFactory.getCurrentSession();

        User user = session.get(User.class, id);
        session.delete(user);
    }

    @Override
    public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();

        User user = session.get(User.class, id);
        return user;
    }

    @Override
    public void saveUser(User user) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);

    }

    @Override
    public List<User> getAllUsers() {

        Session session = sessionFactory.getCurrentSession();
        List<User> allUsers = session.createQuery("from User", User.class).getResultList();

        return allUsers;
    }
}
