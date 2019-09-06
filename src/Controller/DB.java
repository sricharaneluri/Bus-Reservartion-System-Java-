/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author cherry
 */
public interface DB {
   /**
     * Main database constants for connection - for ease of access and change
     */

    public static final String USER_NAME = "practise";
    public static final String PASSWORD = "password";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
}
