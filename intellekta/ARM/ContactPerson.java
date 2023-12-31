package com.intellekta.ARM;

import java.io.Serializable;

public class ContactPerson implements Serializable {

    private String name;
    private String email;
    private String phone;

    public ContactPerson(String name, String email, String phone) {
        this.name = (name == null) ? " " : name;
        this.email = (email == null) ? " " : email;
        this.phone = (phone == null) ? " " : phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

