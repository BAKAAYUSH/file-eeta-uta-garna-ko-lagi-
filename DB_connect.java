package database;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DB_connect {

	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */

	    
	     public static Connection connect()
	    {
	        Connection sos = null;
	        
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            sos = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/rms","root","");
	        } catch (Exception e) 
	        {
	            JOptionPane.showMessageDialog(null, e);
	        }
	        return sos;
	    }

	    public static Connection Connect() {
	        throw new UnsupportedOperationException("Not supported yet."); 
	}
	    
	    public static void main(String args[]) {
	    	
	    	new DB_connect();
			System.out.println( DB_connect.connect());
	    	
	    }

	
}
