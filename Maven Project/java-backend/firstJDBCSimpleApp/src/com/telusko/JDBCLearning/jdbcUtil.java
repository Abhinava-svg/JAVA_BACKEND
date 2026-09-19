package com.telusko.JDBCLearning;
import java.sql.*;

public class jdbcUtil {
    static{
        // Load and register the driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    } 

    public static Connection getConnection() throws SQLException
     {
        
        // Establish the connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        Connection connect = DriverManager.getConnection(url, user, password);

        return connect;
    }

    public static void closeConnection(Connection connect, Statement statement) throws SQLException{
        statement.close();
        connect.close();
    }
}
