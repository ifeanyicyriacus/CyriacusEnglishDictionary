/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyriacus.english_dictionary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cyriacusifeanyi   
 * Env is a class to store environment variables
*/

//Note
//Rename this class file to Env

public class Env_example {

    /**
     *
     */
    protected final Connection conn;
    
    
    
    public Env_example() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DATABASE_NAME", "USERNAME", "PASSWORD");
    }

    /**
     * Get the value of Connection
     *
     * @return the value of Connection
     */
    public Connection getConnection() {
        return conn;
    }
    
    
    
    
    
    
}
