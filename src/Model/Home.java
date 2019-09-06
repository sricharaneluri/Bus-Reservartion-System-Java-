/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.*;


/**
 *
 * @author Anudeep
 */
public class Home {
    String username;
    String password;
    String message;
    String name;
    String phone;
    String emailID;
    DML_Interface dml = new DML_Queries();
    DDL_Interface ddl = new DDL_Queries();
    
    public String login(String username){
        //getpassword from DB
        password = ddl.login(username);
        return password;
    }
    
    public String register(String username, String password, String name, String emailID, String phone){
        //insert user in DB
        message = dml.registration(username, password, name, emailID, phone);
        
        return message;
    }
    
    public String getName(String username){
        //get username from DB
        name = ddl.getName(username);
        return name;
    }
    
    public String getPhone(String username){
        //get Phone from DB
        phone = ddl.getPhone(username);
        return phone;
    }
    public String getEmailId(String username){
        //get EmailID from DB
        emailID = ddl.getEmailID(username);
        return emailID;
    }
    public void updateUserDetails(String username, String name,String emailId, String phone){
        dml.updateUserDeatials(username, emailId, name, phone);
    }
    public String deleteUser(String username){
        message = dml.deleteUser(username);
        return message;
    }
}
