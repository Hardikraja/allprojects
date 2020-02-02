package com.first.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        try{
            String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
            String userId = "root";
            String password = "";
            System.out.println("connecting DB");
            Connection mycon = DriverManager.getConnection(jdbcUrl,userId,password);
            System.out.println("connection 'success'");
        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
