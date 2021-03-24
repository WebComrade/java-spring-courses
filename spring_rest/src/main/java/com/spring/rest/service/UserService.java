package com.spring.rest.service;

import com.spring.rest.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

    public void deleteAllUsers();
}
