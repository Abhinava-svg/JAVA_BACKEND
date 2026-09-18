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
            String sql = "SELECT * FROM studentInfo";
            ResultSet rs = statement.executeQuery(sql);

            // process the result

            while(rs.next())
            {
                // int id = rs.getInt(1);
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
            }
            rs.close();
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
