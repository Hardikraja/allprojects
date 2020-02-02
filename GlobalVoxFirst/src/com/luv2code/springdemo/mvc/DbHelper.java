package com.luv2code.springdemo.mvc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbHelper {
    private Connection con;

    public DbHelper(){
        con = getConnection();
    }

    public void InsertData(String username, String email, String password, String date,String path){
        try {
            Statement statement = con.createStatement();
            String query = "insert into usrtbl values('"+username+"','"+email+"','"+HashIt.hashThePassword(password)+"','"+date+"','"+path+"')";
            statement.executeUpdate(query);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public boolean validateUser(String username,String password) throws Exception{

            Statement statement = con.createStatement();
            String query = "select * from usrtbl where username = '"+username+"' and password ='"+HashIt.hashThePassword(password)+"'";
            //System.out.println(query);
            ResultSet rs = statement.executeQuery(query);
            //System.out.println(rs.getString(0)+" "+rs.getString(1));

            if(rs.next()){
                return true;
            }
            else
            {
                return false;
            }


    }

    public UserBean getUserDetail(String username,String password){
        UserBean userobj = null;
        try{
            Statement statement = con.createStatement();
            String query = "select * from usrtbl where username = '"+username+"' and password='"+HashIt.hashThePassword(password)+"'";
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            userobj = new UserBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
        }catch (Exception e){
            e.printStackTrace();
        }
        return userobj;
    }

    private Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
             connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/userdbg", "root", "");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
