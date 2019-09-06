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

/**
 *
 * @author cherry
 */
public class DDL_Queries implements DDL_Interface{
    
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        public  ArrayList getSource(){
        ArrayList<String> source1 = new ArrayList();
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select distinct(source) from bus_route");
            while(rs.next()) {
                
               source1.add(rs.getString(1));
              
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
        
        return source1;
    }
        
        public ArrayList getDestination(String source){
        ArrayList<String> source1 = new ArrayList();
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select distinct(destination) from bus_route where source = '" + source + "'");
            while(rs.next()) {
                
               source1.add(rs.getString(1));
              
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
        
        return source1;
    }
        
        public int retrieveNextRouteID(){
        int rid = 0;
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select max(routeid)+1 as routeid from bus_route");
            while(rs.next()) {
               rid = rs.getInt(1);
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
        
        return rid;
    }
        
        public  ArrayList getDepartureTime(String src, String dest){
        ArrayList<String> depttime = new ArrayList();
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select departure_time from bus_route where source = '" + src + "' and destination='" + dest + "' order by SUBSTR(DEPARTURE_TIME,7,8)");
            while(rs.next()) {
                
               depttime.add(rs.getString(1));
              
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
        
        return depttime;
    }
        public int retrieveRouteId(String src, String dest, String depttime){
 
        int routeid = 0;
         try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select routeid from bus_route where source = '" + src + "' and destination='" + dest + "' and departure_time='" + depttime + "'");
            while(rs.next()) {
                
               routeid = rs.getInt(1);
              
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
        
        return routeid;
    }
        
        public  String login(String username){
        String password = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select password from users where username='" + username + "'");
            while(rs.next()) {
               password = rs.getString(1);
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
        
        return password;
    }
        
        public  ArrayList getSeatNo(int routeid, Date date){
        ArrayList<Integer> seatno = new ArrayList();
        
        java.sql.Date sdate;
        sdate = new java.sql.Date(date.getTime());
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select seat_no from ticket where routeid='" + routeid + "' and travel_date=to_date('" + sdate + "','yyyy-mm-dd')");
            while(rs.next()) {
                
               seatno.add(rs.getInt(1));
              
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
         return seatno;
    }
        public  BalanceSheetObj getTicketIdAndPrice(Date date3,Date date4){
        BalanceSheetObj bsobj = new BalanceSheetObj();
        java.sql.Date sdate3,sdate4;
        sdate3= new java.sql.Date(date3.getTime());
        sdate4= new java.sql.Date(date4.getTime());
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select ticketid,price from ticket where travel_date between to_date('" + sdate3 + "','yyyy-mm-dd') and to_date('" + sdate4 + "','yyyy-mm-dd')");
            while(rs.next()) {
               
               bsobj.tid.add(rs.getInt(1));
               bsobj.price1.add(rs.getDouble(2));
                         
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
        
        return bsobj;
    }
    public String getArrivalTime(int routeid){
        String arrivalTime = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select arrival_time from bus_route where routeid = '" + routeid + "'");
            while(rs.next()) {
               arrivalTime = rs.getString(1);          
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
        
        return arrivalTime;
    }
    
    public String getDeptTime(int routeid){
        String deptTime = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select departure_time from bus_route where routeid = '" + routeid + "'");
            while(rs.next()) {
               deptTime = rs.getString(1);          
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
        
        return deptTime;
    }
    
    public String getSrc(int routeid){
        String source = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select source from bus_route where routeid = '" + routeid + "'");
            while(rs.next()) {
               source = rs.getString(1);          
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
        
        return source;
    }
    
    public String getDest(int routeid){
        String dest = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select destination from bus_route where routeid = '" + routeid + "'");
            while(rs.next()) {
               dest = rs.getString(1);          
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
        
        return dest;
    }
    
    public double getPrice(int routeid){
        double price = 0.00;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select price from bus_route where routeid = '" + routeid + "'");
            while(rs.next()) {
               price = rs.getDouble(1);          
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
        
        return price;
    }
    public String getName(String username){
        String name = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select name from users where username = '" + username + "'");
            while(rs.next()) {
               name = rs.getString(1);          
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
        
        return name;
    }    
    public String getPhone(String username){
        String phone = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select phonenumber from users where username = '" + username + "'");
            while(rs.next()) {
               phone = rs.getString(1);          
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
        
        return phone;
    }
    public String getEmailID(String username){
        String emailID = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select email from users where username = '" + username + "'");
            while(rs.next()) {
               emailID = rs.getString(1);          
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
        
        return emailID;
    }
    public String getName(int ticketID){
        String name = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select name from ticket where ticketid = '" + ticketID + "'");
            while(rs.next()) {
               name = rs.getString(1);          
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
        
        return name;
    }
    public String getUsername(int ticketID){
        String username = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select username from ticket where ticketid = '" + ticketID + "'");
            while(rs.next()) {
               username = rs.getString(1);          
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
        
        return username;
    }
    public double getPriceT(int ticketID){
        double price = 0.00;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select price from ticket where ticketid = '" + ticketID + "'");
            while(rs.next()) {
               price = rs.getDouble(1);          
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
        
        return price;
    }
    public int getBusID(int ticketID){
        int busID = 0;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select routeid from ticket where ticketid = '" + ticketID + "'");
            while(rs.next()) {
               busID = rs.getInt(1);          
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
        
        return busID;
    }
    public int getSeatNO(int ticketID){
        int seatno = 0;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select seat_no from ticket where ticketid = '" + ticketID + "'");
            while(rs.next()) {
               seatno = rs.getInt(1);          
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
        
        return seatno;
    }
    
    public Date getDate(int ticketID){
        Date date = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select travel_date from ticket where ticketid = '" + ticketID + "'");
            while(rs.next()) {
               date = rs.getDate(1);          
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
        
        return date;
    }
    
    public  BusObj allRoutes(){
        BusObj busobj = new BusObj();
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from bus_route order by routeid");
            while(rs.next()) {
               
               busobj.busid.add(rs.getInt(1));
               busobj.source.add(rs.getString(2));
               busobj.destination.add(rs.getString(3));
               busobj.price.add(rs.getDouble(4));
               busobj.arrivalTime.add(rs.getString(5));
               busobj.departureTime.add(rs.getString(6));
                         
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
        
        return busobj;
    }
    
     public  TicketObj ticketSearch(Date date){
        TicketObj ticketObj = new TicketObj();
        
        try {
            java.sql.Date sdate;
            sdate= new java.sql.Date(date.getTime());
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select ticketid, routeid, username, seat_no from ticket where travel_date= to_date('"  + sdate + "','yyyy-mm-dd')");
            while(rs.next()) {
               
               ticketObj.ticketId.add(rs.getInt(1));
               ticketObj.busID.add(rs.getInt(2));
               ticketObj.username.add(rs.getString(3));
               ticketObj.seatNo.add(rs.getInt(4));
               
                         
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
        
        return ticketObj;
    }
    
}
