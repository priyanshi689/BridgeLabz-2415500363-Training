package com.jdbc.studentjdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentImpl implements IStudent {
	IConnection conn = new ConnectionImpl();
	Scanner sc = new Scanner(System.in);
	@Override
	public void insertStudent()
	{
		try(Connection con = conn.createconnection()){
			System.out.println("Enter Name");
			String name=sc.nextLine();
			System.out.println("Enter Age");
			int  age = sc.nextInt();
			System.out.println("Enter Email");
			String email = sc.next();
			System.out.println("Enter Enrollment_Date");
			String date = sc.next();
			Statement stmt = con.createStatement();
			String query = "INSERT INTO students(name, age, email, enrolled_date) VALUES('"
	                + name + "', " + age + ", '" + email + "', '" + date + "')";
			stmt.executeUpdate(query);
			System.out.println("Data Inserted Successfully");
		}
		catch(Exception e) {
			System.out.println("Insertion failed:"+e.getMessage());
		}
		
	}
	
	@Override
	public void insertMultipleStudent() {
		try(Connection con = conn.createconnection()){
			String query = "INSERT INTO students(name, age, email, enrolled_date) VALUES(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			System.out.println("Enter the number of students");
			int n = sc.nextInt();
			for(int i =1 ;i<=n;i++) {
			
			System.out.println("Enter Name");
			String name=sc.next();
			
			System.out.println("Enter Age");
			int  age = sc.nextInt();
			
			System.out.println("Enter Email");
			String email = sc.next();
			
			System.out.println("Enter Enrollment_Date");
			String date = sc.next();
			
			pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, email);
            Date dateFormat=Date.valueOf(date);
            pstmt.setDate(4,dateFormat);
            
            pstmt.executeUpdate();
    		System.out.println("Data Inserted Successfully");
			}
		}
		catch(Exception e) {
			System.out.println("Insertion Failed:"+e.getMessage());
		}
		
	}
	
	@Override
	public void updateStudent() {
		try(Connection con = conn.createconnection()){
			Statement stmt = con.createStatement();
			System.out.println("Enter Id to update");
			int id =sc.nextInt();
			
			System.out.println("Enter Name to update");
			String name=sc.next();
			
			System.out.println("Enter Age to update");
			int  age = sc.nextInt();
			
			System.out.println("Enter Email to update");
			String email = sc.next();
			
			System.out.println("Enter Enrollment_Date to update");
			String date = sc.next();
			
			String query = "UPDATE students SET name='" + name + "', age=" + age + " WHERE id=" + id;
            stmt.executeUpdate(query);
			System.out.println("Student Details updated Successfully");
		}
		catch(Exception e) {
			System.out.println("Failed to update:"+e.getMessage());
		}
		
	}
	
	@Override
	public void updateMultipleStudent() {
		try(Connection con = conn.createconnection()){
			String query = "UPDATE students SET name=?, age=? ,email=? ,enrolled_date=? WHERE id=?";
			PreparedStatement pstmt = con.prepareStatement(query);
		
			System.out.println("Enter the number of students");
			int n = sc.nextInt();
			for(int i =1 ;i<=n;i++) {
				
				System.out.println("Enter the id of Student");
				int id = sc .nextInt();
			
			System.out.println("Enter Name to update");
			String name=sc.next();
			
			System.out.println("Enter Age to update");
			int  age = sc.nextInt();
			
			System.out.println("Enter Email to update");
			String email = sc.next();
			
			System.out.println("Enter Enrollment_Date to update");
			String date = sc.next();
			
			
			
			pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, email);
            Date dateFormat=Date.valueOf(date);
            pstmt.setDate(4,dateFormat);
            pstmt.setInt(5, id);
            
            pstmt.executeUpdate();
            System.out.println("Student details updated successfully");
			
			
		}
		}
			catch(Exception e) {
				System.out.println("Failed to update:"+e.getMessage());
			}
	}
	
		@Override
	public void deleteStudent() {
	try(Connection con = conn.createconnection())
	{
		Statement stmt = con.createStatement();
		System.out.println("Enter the id for deletion");
		int id = sc.nextInt();
		String query = "DELETE FROM students WHERE id=" + id;
        stmt.executeUpdate(query);
        System.out.println("Data deleted successfully");	
	}
	catch(Exception e) {
		System.out.println("Failed to delete the record"+e.getMessage());
	}
		}
		@Override
	public void deleteMultipleStudent() {
		try(Connection con = conn.createconnection()){
			String query = "Delete from students where id=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			 System.out.print("Enter number of students you want to delete: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            System.out.print("Enter Student ID to delete ");
		            int id = sc.nextInt();
		            pstmt.setInt(1, id);
		            pstmt.executeUpdate();
		            System.out.println("Data deleted successfully");
		            
		}
	}
			catch(Exception e) {
				System.out.println("Failed to update:"+e.getMessage());
			}
		
		
	}
		@Override
	public void showStudent() {
		try(Connection con = conn.createconnection()){
		Statement stmt = con.createStatement();
		String query = "Select * from students";
				ResultSet rs = stmt.executeQuery(query);
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id"));
	                System.out.println("Name: " + rs.getString("Name"));
	                System.out.println("Age: " + rs.getInt("Age"));
	                System.out.println("Email: " + rs.getString("Email"));
	                System.out.println("Enrolled Date: " + rs.getDate("enrolled_date"));
	               // stmt.executeUpdate(query);

	            }
		}
				
	
		catch(Exception e) {
			System.out.println("Failed to fetch details: "+e.getMessage());
		}
	
	
}
	}
