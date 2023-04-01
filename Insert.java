package database;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insert extends DB_connect {
	int id, contact;
	String name, email, password,usertype;
	PreparedStatement pstatement;
	private Component btnNewButton;
	
	
	public void insertUser (int contact, String name, String email, String password) {
try {
			
			String query = "INSERT INTO user (name,email,password,contact,usertype) values (?,?,?,?,'customer')";
			
			pstatement = connect().prepareStatement(query);
			
			pstatement.setString(1, name);
			pstatement.setString(2, email);
			pstatement.setString(3, password);
			pstatement.setInt(4, contact);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"Customer Added successfully !");
			 
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		new Insert().insertUser(98763452, "Bhesraj Shrestha", "shrestha@gmail.com", "bshrestha123");
	}
	
}

/**
 * package connection.database;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
/**
 * This class extends the DBConnection and gets the connection
 * All the insert related queries are here .
 * @author Dorze
 *
 *
public class Insert extends DBConnection {
	public Insert() {
		super();
	}
	
	/**
	 * necessary imports for the connections and insert
	 *
	PreparedStatement pstatement;
	private Component btnNewButton;
	
	/**
	 * Takes name email password contact course and id of the student and stores in the database
	 * @param name
	 * @param email
	 * @param password
	 * @param contact
	 * @param course
	 * @param studentid
	 *
	public void addIntoStudent(String name, String email, String password, String contact, String course, String studentid) {
		try {
			
			String query = "INSERT INTO student (name,email,password,contact,course,studentid,usermode) values (?,?,?,?,?,?,'Student')";
			
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setString(1, name);
			pstatement.setString(2, email);
			pstatement.setString(3, password);
			pstatement.setString(4, contact);
			pstatement.setString(5, course);
			pstatement.setString(6, studentid);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"Student Added successfully !");
			 
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * This methods inserts the course into the course table
	 * @param coursename
	 * @param duration
	 * @param courseid
	 *
	public void addCourse(String coursename , String duration , String courseid) {
		try {
			
			String query = "INSERT INTO course (coursename,duration,CourseID) values (?,?,?)";
			
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setString(1, coursename);
			pstatement.setString(2, duration);
			pstatement.setString(3, courseid);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"Course Added successfully !");
			 
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * This method inserts the tutor into the tutor table in the herald database
	 * @param name
	 * @param email
	 * @param password
	 * @param contact
	 *
	public void addTutor(String name , String email , String password, String contact) {
		try {
			
			String query = "INSERT INTO instructor (instructorname, email, password, contact, usermode) values (?,?,?,?,'Instructor')";
			
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setString(1, name);
			pstatement.setString(2, email);
			pstatement.setString(3, password);
			pstatement.setString(4, contact);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			

			 JOptionPane.showMessageDialog(btnNewButton,"Tutor Added successfully !");
			 
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}

 * 
 * 
 * **/
