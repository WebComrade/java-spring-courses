package com.spring.rest.entity;

import javax.persistence.*;

public class User {

    private int id;
    private String nick;
    private String password;

    public User(){

    }

    public User(String nick, String password) {
        this.id = id;
        this.nick = nick;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{\n" +
                "'id': '"+getId()+"'\n" +
                "'nick': '"+getNick()+"'\n" +
                "'password': '"+getPassword()+"\n}";
    }
}
