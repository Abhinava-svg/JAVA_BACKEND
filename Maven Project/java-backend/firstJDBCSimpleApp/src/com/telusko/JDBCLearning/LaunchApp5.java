package com.telusko.JDBCLearning;
import java.sql.*;
import java.util.Scanner;

public class LaunchApp5 {
    public static void main(String [] args){

        Connection connect = null;
        PreparedStatement pstmt = null;

        try{
            connect = jdbcUtil.getConnection();

            String sql = "DELETE FROM studentInfo WHERE id = ?";
            pstmt = connect.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter info that needs to be deleted");
            System.out.println("Kindly enter your id");
            Integer id = sc.nextInt();

           
            pstmt.setInt(1, id);
           

            int rowAffected = pstmt.executeUpdate();

            if(rowAffected == 0)
            {
                System.out.println("Unable to delete the data");
            }
            else{
                System.out.println("Data deleted Successfully");
            }
            sc.close();
        }

        catch (SQLException e){
            e.printStackTrace();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
