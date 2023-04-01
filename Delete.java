package database;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Delete extends DB_connect{
	PreparedStatement pstatement;
	private Component btnNewButton;
	 public void removeuser(int id) {
		 try {
			 String query = "DELETE FROM user where id = ?";
				
				pstatement = connect().prepareStatement(query);
				
				pstatement.setLong(1, id);
				
				pstatement.executeUpdate();
				
				pstatement.close();
				
				 JOptionPane.showMessageDialog(btnNewButton,"User Deleted successfully !");
			 
		 }
		 catch(SQLException e) {
				JOptionPane.showMessageDialog(btnNewButton, "Error occured !! "); {
			 
		 
		 }
				
		 }
		 
	 }
	 public static void main(String args[]) {
		 new Delete().removeuser(5);
	 }
}

	
	
	




/**
 * 
 * 
 * package connection.database;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


/**
 * All the deletion or remove related queries are here in this class 
 * It extends DBConnection for connection 
 * @author Dorze
 *
 *
public class Remove extends DBConnection{
	public Remove() {
		super();
	}
	
	PreparedStatement pstatement;
	private Component btnNewButton;
	
	/**
	 * Takes the id of a student and deletes  the respective student
	 * @param id
	 *
	public void removeStudent(int id) {
		try {
			
			String query = "DELETE FROM student where id = ?";
			
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setLong(1, id);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			
			 JOptionPane.showMessageDialog(btnNewButton,"Student Deleted successfully !");
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(btnNewButton, "Error occured !! ");
		}
	}
	
	/**
	 * takes the id and deletes the respective course
	 * @param id
	 *
	public void removeCourse(int id) {
		try {
			
			String query = "DELETE FROM course where sn = ?";
			
			pstatement = getConnection().prepareStatement(query);
			
			pstatement.setLong(1, id);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			
			JOptionPane.showMessageDialog(btnNewButton,"Course Deleted successfully !");
		}
		catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(btnNewButton, "Error occured !! ");
		}
		
	}

	
	/**
	 * takes the interger id and deletes the respective tutor 
	 * @param id
	 *
	public void removeTutor(int id) {
		try {

			String query = "DELETE FROM instructor WHERE id = ? ";
			
			pstatement = getConnection().prepareStatement(query);
			pstatement.setLong(1, id);
			
			pstatement.executeUpdate();
			
			pstatement.close();
			
			JOptionPane.showMessageDialog(btnNewButton, "Tutor deleted successfully !");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(btnNewButton, "Error occured !! ");
		}
		
	}
	
}

 * **/
 