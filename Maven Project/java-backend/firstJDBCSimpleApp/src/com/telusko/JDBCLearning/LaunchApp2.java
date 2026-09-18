package com.telusko.JDBCLearning;
import java.sql.*;

public class LaunchApp2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Load and Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        Connection connect = DriverManager.getConnection(url, user, password);

        // creating statement

        Statement statement = connect.createStatement();

            //execute query
            String sql = "DELETE FROM studentInfo where id = 101";
            int rowAffected = statement.executeUpdate(sql);

            // process the result
            if(rowAffected == 0){
                System.out.println("failed to delete the record");
            }
            else{
                System.out.println("successfully deleted");
            }
            // close the resources
            statement.close();
            connect.close();
           
        }
    }

    