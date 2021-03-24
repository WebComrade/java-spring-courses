package com.spring.mvc.entities;

import com.spring.mvc.validation.CheckMail;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "Name is required field")
    private String name;

    @Pattern(regexp = "\\d{10}", message = "incorrect phone number")
    private String phoneNumber;

    @CheckMail
    private String mail;

    public User(String name, String phoneNumber, String mail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
