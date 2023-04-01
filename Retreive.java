package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Retreive extends DB_connect {
	Statement statement;
	ResultSet rs;
	
	int id,contact;
	String name, email,  usertype, password;
	
	public ArrayList<Object[]> retreive() {
		ArrayList<Object[]> user = new ArrayList<>();
		try {
			
			String query = "SELECT id, name, email,contact, usertype, password from user";

			statement = connect().createStatement();
			rs = statement.executeQuery(query);
			
			while(rs.next()) {
				
				 id           = rs.getInt("id");
				name = rs.getString("name");
				email          = rs.getString("email");
				contact = rs.getInt("contact");
				usertype = rs.getString("usertype");
				password  = rs.getString("password");
				
				Object[] row = {id,name,email,contact,usertype,password};
				
				user.add(row);
			
			}
			
			statement.close();
			rs.close();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			
		}
		
		return user;
		
	}
	
	

	public static void main(String args[]) {
		new DB_connect();
		System.out.println(new Retreive().retreive());
	}
}
/**
 

package connection.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * All the selection realted actions are performed in this class 
 * Extedns DBConnection for the connection
 * @author Dorze
 *
 */
/*
public class Select extends DBConnection{
	public Select() {
		super();
	}
	Statement statement;
	ResultSet rs;
	
	/**
	 * Returns the arraylist of student data retrieved form the database
	 * @return
	 */
/*
	public ArrayList<Object[]> studentData() {
		
		ArrayList<Object[]> data = new ArrayList<>();
		try {
			String query = "SELECT sn,coursename,duration, CourseID FROM course";
			
			statement = getConnection().createStatement();
			rs = statement.executeQuery(query);
			
			/**
			 * retrieves the data from the database through all the rows.
			 */
/*
			while(rs.next()) {
				
				int sn           = rs.getInt("sn");
				String courseName = rs.getString("courseName");
				int ID           = rs.getInt("duration");
				String courseId = rs.getString("CourseID");
				
				Object[] row = {sn,courseName,ID,courseId};
				
				/**
				 * adds the retrieved data into the arraylist.
				 *
				data.add(row);
			
			}
			
			statement.close();
			rs.close();
			
			
			
			
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			
		}
		
		return data;
		
	}
	
	/**
	 * returns the arraylist of the tutordata retrieved from the database
	 * @return
	 *
	public ArrayList<Object[]> getTutorsData() {
		int ID;
		String instructorName,email,contact;
		ArrayList<Object[]> tutorsData = new ArrayList<>();
		
		try {
			
			String query = "SELECT id, instructorname, email, contact FROM 	instructor";
			
			statement  = getConnection().createStatement();
			rs = statement.executeQuery(query);
			
			while(rs.next()) {
				ID = rs.getInt("id");
				instructorName = rs.getString("instructorname");
				email = rs.getString("email");
				contact = rs.getString("contact");
				
				Object[] tutorsRow = {ID,instructorName,email,contact};
				
				tutorsData.add(tutorsRow);
				
				
			}
			statement.close();
			rs.close();
			
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tutorsData;
		
	}
	
	/**
	 * Returns the arraylist of the student data retrieved from the database
	 * @return
	 *
	public ArrayList<Object[]> getStudentData (){
		
		ArrayList<Object[]> studentData = new ArrayList<>();
		
		int id;
		String name,email,course,contact,query,studentid;
		
		try {
			
			query = "SELECT id,name,email,contact,course,studentid FROM student";
			statement = getConnection().createStatement();
			rs = statement.executeQuery(query);
			
			while(rs.next()) {
				id = rs.getInt("id");
				name = rs.getString("name");
				email = rs.getString("email");
				contact = rs.getString("contact");
				course = rs.getString("course");
				studentid = rs.getString("studentid");
				
				
				Object[] studentDataE = {id,name,email,contact,course,studentid};
				
				studentData.add(studentDataE);
			}
			
			statement.close();
			rs.close();
			
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return studentData;
		
		
		
	}
	
	/**
	 * Returns inter / number of courses
	 * @return
	 *
	public int courseNo() {
		int courseNumber = 0;
		try {
			String query = "SELECT COUNT(*) FROM  course";
			statement = getConnection().createStatement();
			rs = statement.executeQuery(query);
			
			
			if(rs.next()) {
				courseNumber = rs.getInt(1);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return courseNumber;
	}
	
	
	/**
	 * Retunrs integer / number of students 
	 * @return
	 *
	public int studentNumber() {
		int studentNumber = 0;
		try {
			String query = "SELECT COUNT(*) FROM  student";
			statement = getConnection().createStatement();
			rs = statement.executeQuery(query);
			
			
			if(rs.next()) {
				studentNumber = rs.getInt(1);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return studentNumber;
	}
	
	/**
	 * Returns the number of teachers available 
	 * @return
	 *
	public int tutorNumber() {
		int tutorNumber = 0;
		try {
			String query = "SELECT COUNT(*) FROM  instructor";
			statement = getConnection().createStatement();
			rs = statement.executeQuery(query);
			
			
			if(rs.next()) {
				tutorNumber = rs.getInt(1);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return tutorNumber;
	}

}
**/