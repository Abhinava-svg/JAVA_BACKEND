package com.telusko.JDBCLearning;
import java.sql.*;
import java.util.Scanner;

public class LaunchApp7 {
    public static void main(String[] args){
         Connection connect = null;
        PreparedStatement pstmt = null;

        try{
            connect = jdbcUtil.getConnection();

            String sql = "UPDATE studentInfo SET sage = ? WHERE id = ?";
            pstmt = connect.prepareStatement(sql);

            pstmt.setInt(1, 20);
            pstmt.setInt(2, 1);
            pstmt.addBatch();
            pstmt.setInt(1, 22);
            pstmt.setInt(2, 101);
            pstmt.addBatch();

            pstmt.executeBatch();
            System.out.println("chcek the database table to see the result");

        }

        catch (SQLException e){
            e.printStackTrace();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
