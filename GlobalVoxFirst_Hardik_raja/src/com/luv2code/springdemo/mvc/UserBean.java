package com.luv2code.springdemo.mvc;

import javax.servlet.http.Part;
import java.util.Date;

public class UserBean {

    private String username;
    private String email;
    private String password;
    private String dob;
    private String imagepath;


    public UserBean(){

    }


    public UserBean(String username, String email, String password, String dob, String imagepath) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.imagepath = imagepath;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dob='" + dob + '\'' +
                ", imagepath='" + imagepath + '\'' +
                '}';
    }
}
