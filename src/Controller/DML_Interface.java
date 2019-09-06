/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;

/**
 *
 * @author cherry
 */
public interface DML_Interface {
    public abstract void updateBusRoute(int rid, double price,String depttime, String arvltime);
    public abstract void deleteBusRoute(int routeid);
    public abstract void addBusRoute(int busId,String source, String destination,Double cost, String depttime, String arvltime);
    public abstract String registration(String username, String password, String name, String emailid, String phonenumber);
    public abstract String deleteUser(String username);
    public abstract void updateUserDeatials(String username, String email,String name, String phonenumber);
    public abstract int getTicketId(int routeid, String username,String name, Date date1, int sno1, double cost);
    public abstract void cancelTicket(int ticketid);
    
}
