package com.frankmoley.lil.learningspring.data.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    private int uid;
    private String uname;
    @Autowired
    private Wallet wallet;

    public User() {
        System.out.println("User created..");
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        wallet.setValue(25);
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}
