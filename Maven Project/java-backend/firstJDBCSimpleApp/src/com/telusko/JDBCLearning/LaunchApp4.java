package com.telusko.JDBCLearning;
import java.sql.*;
import java.util.Scanner;

public class LaunchApp4 {
    public static void main(String[] args) {

        Connection connect = null;
        PreparedStatement pstmt = null;

        try{
           connect = jdbcUtil.getConnection();
        // creating statement

        // statement = connect.createStatement();

            //execute query
            String query= "INSERT INTO studentInfo(id, sname, sage, scity) VALUES (?,?,?,?)";
            pstmt = connect.prepareStatement(query);

            System.out.println("Please enter the following details to be stored in DB");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your id");
            Integer id = sc.nextInt();

            System.out.println("Enter your name");
            String name = sc.next();

            System.out.println("Enter your age");
            Integer age = sc.nextInt();

            System.out.println("Enter your city");
            String city = sc.next();


            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setString(4, city);

            int rowAffected = pstmt.executeUpdate();

            // process the result
            if(rowAffected == 0){
                System.out.println("Unable to insert the data");
            }
            else{
                System.out.println("Data inserted successfully");
            }
            // close the resources
            pstmt.close();
            connect.close();
            sc.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                jdbcUtil.closeConnection(connect, pstmt);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
