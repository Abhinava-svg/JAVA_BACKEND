package com.telusko.JDBCLearning;
import java.sql.*;

public class LaunchApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Load and Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = getRequiredEnvironmentVariable("DB_USERNAME");
        String password = getRequiredEnvironmentVariable("DB_PASSWORD");
        try (Connection connect = DriverManager.getConnection(url, user, password);
             Statement statement = connect.createStatement()) {

            //execute query
            String sql = "INSERT INTO studentInfo(id, sname, sage, scity) VALUES (1, 'ABHINAVA', 21, 'BENGALURU')";
            int rowAffected = statement.executeUpdate(sql);

            // process the result

            if(rowAffected==0){
                System.out.println("Unable to insert the data");
            }
            else{
                System.out.println("Data inserted successfully");
            }
        }
    }

    private static String getRequiredEnvironmentVariable(String name) {
        String value = System.getenv(name);

        if (value == null || value.isBlank()) {
            throw new IllegalStateException(
                    name + " is not set. Set it locally before running the application.");
        }

        return value;
    }
}
