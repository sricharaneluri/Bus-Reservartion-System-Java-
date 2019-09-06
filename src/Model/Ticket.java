    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Anudeep
 */
public class Ticket {
    
    
    DDL_Interface ddl = new DDL_Queries();
    DML_Interface dml = new DML_Queries();
    
    int ticketId;
    String username;
    String name;
    double price;
    int busID;
    int seatNo;
    Date date;
    double tprice;
    public ArrayList bookedSeats(int busID, Date date){
        //get bookedseats from DB
        ArrayList<Integer> bseats;
        bseats = ddl.getSeatNo(busID, date);
        return bseats;
        
    }
    
    public int newTicket(String username, String name, int busId, double amount,int seat, Date date){
        //get ticketID from db;
        
        ticketId = dml.getTicketId(busId, username, name, date, seat, amount);
        return ticketId;
        
    }
    public String getUsername(int ticketid){
        //get username from ticket table
        username = ddl.getUsername(ticketid);
        return username;
    }
    public String getName(int ticketid){
        //get name from ticket table
        name = ddl.getName(ticketid);
        return name;
    }
    
    public double getAmount(int ticketid){
        //get amount from ticket table
        price = ddl.getPriceT(ticketid);
        return price;
    }
    
    public int getSeatno(int ticketid){
        //get seatNo from ticket table
        seatNo = ddl.getSeatNO(ticketid);
        return seatNo;
    }
    
    public Date getDate(int ticketid){
        //get date from db
        date = ddl.getDate(ticketid);
        return date;
    }
    
    public int getBusID(int ticketid){
        //get busID from ticket table
        busID = ddl.getBusID(ticketid);
        return busID;
    }
    
    public void cancelTicket(int ticketid){
        //delete ticket from db
        dml.cancelTicket(ticketid);
    }
    
    public BalanceSheetObj getBalanceSheet(Date fromDate, Date toDate){
        BalanceSheetObj bsobj;
        bsobj = ddl.getTicketIdAndPrice(fromDate, toDate);
       
        for(int i =0;i<bsobj.tid.size();i++){
            tprice = tprice + bsobj.price1.get(i);
            
        }
        bsobj.tid.add(null);
        bsobj.price1.add(tprice);
        tprice = 0.00;
        
        return bsobj;
    }
    
    public TicketObj ticketSearch(Date date, int busID){
        TicketObj ticketObj;
        ticketObj = ddl.ticketSearch(date);
        
        if(busID!=0)
        {
            for(int i =0;i<ticketObj.ticketId.size();i++)
            {
                if(ticketObj.busID.get(i)!= busID)
                {
                    ticketObj.ticketId.remove(i);
                    ticketObj.busID.remove(i);
                    ticketObj.seatNo.remove(i);
                    ticketObj.username.remove(i);
                    
                }
               
            }
        
               
        }
        return ticketObj;
    
    }
}
