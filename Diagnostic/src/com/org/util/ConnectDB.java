/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sahilsood
 */
public class ConnectDB {

    /**
     *
     * @return
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/diagnostic", "root","root");
        } catch (Exception e) {
            System.out.println("Unable to connect" + e);
            
        }//jdbc:mysql://hostname:port/dbname","username", "password"
        return conn;
    }
}
