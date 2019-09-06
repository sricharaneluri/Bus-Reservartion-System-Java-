/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DDL_Interface;
import Controller.DDL_Queries;
import Controller.DML_Interface;
import Controller.DML_Queries;

/**
 *
 * @author Anudeep
 */
public class Test {
     
   DML_Interface dml = new DML_Queries();
   int busId;
   int nbusId;
   
   String dest;
   String arrivalTime;
   String deptTime;
   double price;
    public static String getSource(int busId){
        //get source from db
        String source;
        DDL_Interface ddl = new DDL_Queries();
        source = ddl.getSrc(busId);
        return source;
    }
    public static String getUsername(int ticketid){
        //get username from ticket table
        String username;
        DDL_Interface ddl = new DDL_Queries();
        username = ddl.getUsername(ticketid);
        return username;
    }
    
    public static void main(String args[]){
        System.out.println(getUsername(10000));
    }
    
}
