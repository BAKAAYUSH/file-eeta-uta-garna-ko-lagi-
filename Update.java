package database;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Update extends DB_connect {
	PreparedStatement pstatement;
	private Component btnNewButton;
	
	public void updateUser( int id, String name, String email, int contact, String password, String usertype) {
		try {
			
			String query = "UPDATE user SET name = ?, email=?, contact = ? , password = ? , usertype = ? where id = ?";

			 
			pstatement = connect().prepareStatement(query);
			
			pstatement.setString(1, name);
			pstatement.setString(2, email);
			pstatement.setInt(3, contact);
			pstatement.setString(4, password);
			pstatement.setString(5, usertype);
			pstatement.setInt(6, id);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"user updated successfully !");
			 
			
			
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(btnNewButton,"Error occured while trying to update table !");
			e.printStackTrace();
		}
	}
	

	public static void main(String args[]) {
		new DB_connect();
		new Update().updateUser(1, "Duman Dorze", "dumzan@gmail.com",98763645, "dumzan123", "admin");
	}


	

}

/**

package connection.database;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


/**
 * All the update realted queries are here in this class 
 * child class of DBConnection 
 * @author Dorze
 *
 *
public class Update extends DBConnection {
	
	public Update() {
		super();
	}
	PreparedStatement pstatement;
	private Component btnNewButton;
	
	/**
	 * Takes  arguments of string  type and int type  to update the table student 
	 * @param name
	 * @param email
	 * @param contact
	 * @param course
	 * @param studentId
	 * @param id
	 *
	public void updateStudent(String name, String email, String contact, String course, String studentId , int id) {
		try {
			
			String query = "UPDATE student SET name = ?, email=?, contact = ?, course = ? , studentid = ? where id = ?";

			 
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setString(1, name);
			pstatement.setString(2, email);
			pstatement.setString(3, contact);
			pstatement.setString(4, course);
			pstatement.setString(5, studentId);
			pstatement.setInt(6, id);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"Table updated successfully !");
			 
			
			
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(btnNewButton,"Error occured while trying to update table !");
			//e.printStackTrace();
		}
	}
	
	/**
	 * takes arguments of type string and int as shown bellow to update the table course in the database.
	 * @param courseName
	 * @param duration
	 * @param corseId
	 * @param id
	 *
	public void updateCourse(String courseName, String duration, String corseId, int id) {
		try {
			
			String query = "UPDATE course SET coursename = ?, duration=?, CourseID = ? where sn = ?";

			 
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setString(1, courseName);
			pstatement.setString(2, duration);
			pstatement.setString(3, corseId);
			pstatement.setInt(4, id);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"Course updated successfully !");
			 
			
			
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(btnNewButton,"Error occured while trying to update table !");
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * Takes parameter of strings, string , stirng  and int 
	 * updates the table of tutor in the herald database
	 * 
	 * @param name
	 * @param email
	 * @param contact
	 * @param id
	 *
	public void updateTutor(String name, String email, String contact, int id) {
		try {
			
			String query = "UPDATE instructor SET instructorname = ?, email=?, contact = ? where id = ?";

			 
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setString(1, name);
			pstatement.setString(2, email);
			pstatement.setString(3, contact);
			pstatement.setInt(4, id);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"Tutor updated successfully !");
			 
			
			
			
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(btnNewButton,"Error occured while trying to update table !");
			e.printStackTrace();
		}
		
	}
	
	
	
}

**/
