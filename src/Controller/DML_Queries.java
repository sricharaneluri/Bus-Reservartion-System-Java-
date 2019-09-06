/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.DB.DRIVER;
import static Controller.DB.PASSWORD;
import static Controller.DB.URL;
import static Controller.DB.USER_NAME;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author cherry
 */
public class DML_Queries implements DML_Interface{
    
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        
    public  void updateBusRoute(int rid, double price,String depttime, String arvltime){

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            String query = "update bus_route set PRICE='" + price + "', DEPARTURE_TIME='" + depttime + "', ARRIVAL_TIME='" + arvltime + "' where routeid = '" + rid + "'";
            stmt.executeUpdate(query);
//            if(count==1)
//                System.out.println("emailID for the user is updated");
//            else
//                System.out.println("NO user present with the given username");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
        
    }
    
     public  void deleteBusRoute(int routeid){
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            String query = "delete from bus_route where routeid='" + routeid + "'";
            stmt.executeUpdate(query);
               
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
        
    }
     
     public  void addBusRoute(int busId,String source, String destination,Double cost, String depttime, String arvltime){             
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("insert into bus_route values(?,?,?,?,?,?)");
                   pst.setInt(1,busId);
                   pst.setString(2,source);
                   pst.setString(3,destination);
                   pst.setDouble(4,cost);
                  
                   pst.setString(5,depttime);
                   pst.setString(6,arvltime);
                  
                   pst.executeUpdate();
                  
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
             
    }
     
     public String registration(String username, String password, String name, String emailid, String phonenumber){
        String message = null;
        String password1 = null;
        //PreparedStatement pst = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select password from users where username='" + username + "'");
            while(rs.next()) {
               password1 = rs.getString(1);
            }
             if(password1!=null){
                   
                   message =  "User Already exists";
               } else {
                   PreparedStatement pst=con.prepareStatement("insert into users values(?,?,?,?,?)");
                   pst.setString(1,username);
                   pst.setString(2,password);
                   pst.setString(3,name);
                   pst.setString(4,emailid);
                   pst.setString(5,phonenumber);
                   pst.executeUpdate();
                   message =  "User created";
               }
         } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
        return message;
    }
     
     public String deleteUser(String username){
        String message = null;
         try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            String query = "delete from users where username='" + username + "'";
            int count = stmt.executeUpdate(query);
            if(count==1)
                message = "User is Deleted";
            
                
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            
            // TODO Auto-generated catch block
            //e.printStackTrace();
            message = "User is not present";
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }     
         return message;
    }
     
     public void updateUserDeatials(String username, String email,String name, String phonenumber){
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            String query = "update users set email='" + email + "', phonenumber='" + phonenumber + "', name='" + name + "' where username = '" + username + "'";
            stmt.executeUpdate(query);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
     }
     
     public   int getTicketId(int routeid, String username,String name, Date date1, int sno1, double cost){
        int ticketid = 0;
        
        java.sql.Date sdate1;
        sdate1 = new java.sql.Date(date1.getTime());
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("insert into ticket values(ticketid_seq.nextval,?,?,?,?,?,?)");
                   pst.setInt(1,routeid);
                   pst.setString(2,username);
                   pst.setString(3,name);
                  
                   pst.setDate(4,sdate1);
                   pst.setInt(5,sno1);
                   pst.setDouble(6,cost);
                   pst.executeUpdate();
                  
                   
                   rs = stmt.executeQuery("select ticketid from ticket where routeid='" + routeid + "' and username='" + username + "' and travel_date=to_date('" + sdate1 + "','yyyy-mm-dd')");
                   
                   while(rs.next()) {
                    ticketid = rs.getInt(1);
                    }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
        
        return ticketid;     
    }
        public void cancelTicket(int ticketid){
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            String query = "delete from ticket where ticketid='" + ticketid + "'";
            stmt.executeUpdate(query);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }   
    }
    
}
