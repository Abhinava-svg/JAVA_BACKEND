package com.telusko.JDBCLearning;
import java.sql.*;
import java.util.Scanner;

public class LaunchApp6 {
    public static void main(String[] args) {
        Connection connect = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;;

        try{
            connect = jdbcUtil.getConnection();

            String sql = "SELECT id, sname, sage, scity FROM studentInfo WHERE id = ?";
            pstmt = connect.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly enter your id for which Data to be Retrieved");
            Integer id = sc.nextInt();

           
            pstmt.setInt(1, id);
           
            rs = pstmt.executeQuery();
            

            if(rs.next())
            {
                Integer sid = rs.getInt(1);
                String sname = rs.getString(2);
                Integer sage = rs.getInt(3);
                String scity = rs.getString(4);
                System.out.println(sid + " " + sname + " " + sage + " " + scity);
            }
            else{
                System.out.println("No data found");
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
