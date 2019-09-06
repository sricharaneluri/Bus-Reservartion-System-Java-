/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import Controller.*;


/**
 *
 * @author Anudeep
 */
public class Bus {
    
   DDL_Interface ddl = new DDL_Queries();
   DML_Interface dml = new DML_Queries();
   int busId;
   int nbusId;
   String source;
   String dest;
   String arrivalTime;
   String deptTime;
   double price;
           
    
    public ArrayList source(){
        //Get sourceitems from DB
        ArrayList<String> source = new ArrayList();
        source = ddl.getSource();
        return source;
    }
    
    public ArrayList destination(String source){
    //get destinationitems from DB
        ArrayList<String> destitems = new ArrayList();
        destitems = ddl.getDestination(source);
        return destitems;
    }
    
     public ArrayList departuretime(String source,String destination){
    //get destinationitems from DB
        ArrayList<String> deptitems = new ArrayList();
        deptitems = ddl.getDepartureTime(source, destination);
        
        return deptitems;
    }
    
    public int busSelect(String source,String destination,String depttime,Date date){
        //get bus id from DB
        busId = ddl.retrieveRouteId(source, destination, depttime);
        return busId; 
    }
    
    public String getSource(int busId){
        //get source from db
        source = ddl.getSrc(busId);
        return source;
    }
    
    public String getDestination(int busId){
        //get destination from db
        dest = ddl.getDest(busId);
        return dest;
    }
    
    public String getArrivalTime(int busID){
        //get arrival time from db
        arrivalTime = ddl.getArrivalTime(busID);
        return arrivalTime;
    }
    
    public String getDepartureTime(int busID){
        //get departure time from db
        deptTime = ddl.getDeptTime(busID);
        return deptTime;
    }
    
    public double getAmount(int busID){
        //get price from db
        price = ddl.getPrice(busID);
        return price;
    }
    public int getNextRouteID(){
        //get new route id from DB
        nbusId = ddl.retrieveNextRouteID();
        return nbusId;
    }
    
    public void addRoute(int busId,String source, String destinantion, String arrivaltime, String depttime, double price){
        //add new route to DB
        dml.addBusRoute(busId,source, destinantion, price, depttime, arrivaltime);
        
    }
    public void updateRoute(int busId,String arrivaltime,String depttime, double price){
        dml.updateBusRoute(busId, price, depttime, arrivaltime);
    }
    public void deleteRoute(int busId){
        //delete bus from db
        dml.deleteBusRoute(busId);
    }
    
    public BusObj getAllRoutes(){
        BusObj busobj;
        busobj = ddl.allRoutes();
        return busobj;
    }
}
