/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class Connect {
     private static String DB_NAME = "webdemo";
    private static String DB_URL = "jdbc:mysql://localhost/";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
 
    public static Connection getConnection() throws Throwable {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL + DB_NAME, USER_NAME, PASSWORD);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new Throwable("Can't create connection");
        }
    }
    
}
