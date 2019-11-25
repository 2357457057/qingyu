package com.hwua.entity;

public class User {
    private String ID;
    private String NAME;
    private String PWD;
    private String Email;

    public User() {
    }

    public User(String NAME, String PWD, String email) {
        this.NAME = NAME;
        this.PWD = PWD;
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", NAME='" + NAME + '\'' +
                ", PWD='" + PWD + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    public User(String NAME, String PWD) {
        this.NAME = NAME;
        this.PWD = PWD;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
