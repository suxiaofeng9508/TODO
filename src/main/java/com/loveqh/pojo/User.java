package com.loveqh.pojo;

/**
 * Created by WL on 2017-04-23.
 */
public class User {

    private int id;
    private String name;
    private String password;
    private String email;
    private String lastLogin;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String toString() {
        return "User[ name=" + name + ", password=" + password +
                ", email=" + email + ", lastLogin=" + lastLogin + " ]";
    }
}
