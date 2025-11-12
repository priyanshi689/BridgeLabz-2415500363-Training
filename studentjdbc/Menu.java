package com.jdbc.studentjdbc;
import java.sql.Connection;
import java.util.Scanner;

public class Menu implements IMenu{
	@Override
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		ConnectionImpl connectionImpl = new ConnectionImpl();
		Connection con = connectionImpl.createconnection();
		IStudent student=new StudentImpl();

		
		do {
			System.out.println("Operation Menu");
			System.out.println("1.Insert Student");
			System.out.println("2.Insert multiple Student");
			System.out.println("3.Update Student");
			System.out.println("4.Update multiple student");
			System.out.println("5.Delete a Student");
			System.out.println("6.Delete multiple Student");
			System.out.println("7.Show Students");
			System.out.println("Enter the operation number you want to perform");
			choice =sc.nextInt();
		
			switch(choice) {
			case 1: student.insertStudent();
			break;
			case 2: student.insertMultipleStudent();
			break;
			case 3: student.updateStudent();
			break;
			case 4: student.updateMultipleStudent();
			break;
			case 5: student.deleteStudent();
			break;
			case 6: student.deleteMultipleStudent();
			break;
			case 7: student.showStudent();
			break;
			 default:
				 System.out.println("Invalid choice");
			}
			
			
		}while(choice>7);
		sc.close();
	}

}
