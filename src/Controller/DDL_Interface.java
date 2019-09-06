/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cherry
 */
public interface DDL_Interface {
    
    public abstract ArrayList getSource();
    public abstract ArrayList getDestination(String source);
    public abstract int retrieveNextRouteID();
    public abstract ArrayList getDepartureTime(String src, String dest);
    public abstract int retrieveRouteId(String src, String dest, String depttime);
    public abstract String login(String username);
    public abstract ArrayList getSeatNo(int routeid, Date date);
    public abstract BalanceSheetObj getTicketIdAndPrice(Date date3,Date date4);   
    public abstract String getArrivalTime(int routeid);
    public abstract String getDeptTime(int routeid);
    public abstract String getSrc(int routeid);
    public abstract String getDest(int routeid);
    public abstract double getPrice(int routeid);
    public abstract String getName(String username);
    public abstract String getPhone(String username);
    public abstract String getEmailID(String username);
    public abstract String getName(int ticketID);
    public abstract String getUsername(int ticketID);
    public abstract double getPriceT(int ticketID);
    public abstract int getBusID(int ticketID);
    public abstract int getSeatNO(int ticketID);
    public abstract Date getDate(int ticketID);
    public abstract BusObj allRoutes();
    public abstract TicketObj ticketSearch(Date date);
    
}
