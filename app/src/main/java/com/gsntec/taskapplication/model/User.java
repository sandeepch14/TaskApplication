package com.gsntec.taskapplication.model;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String mobile_number;
    private String date_of_birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() { return mobile_number; }

    public void setMobileNumber(String mobile_number) { this.mobile_number = mobile_number; }

    public String getDateOfBirth() { return date_of_birth; }

    public void setDateOfBirth(String date_of_birth) { this.date_of_birth = date_of_birth; }
}

