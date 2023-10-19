package com.tns.database.dao;

import java.sql.SQLException;

public class StudentDemo {

	public static void main(String[] args) {
		//StudentServiceImpl service=new StudentServiceImpl();
		/*
		 * StudentServiceImplUsingPreaparedStmt service=new
		 * StudentServiceImplUsingPreaparedStmt(); int n; try { n=service.addStudent(8,
		 * "Nikita", 67, 103); if (n>0)
		 * System.out.println("Record inserted successfully....");
		 * 
		 * n=service.updateStudentPerByRollNo(101, 90); if (n>0)
		 * System.out.println("Record updated successfully....");
		 * 
		 * 
		 * n=service.deleteStudentByRollNo(3); if (n>0)
		 * System.out.println("Record deleted successfully....");
		 * 
		 * n=service.deleteStudentByName("Nikhil"); if (n>0)
		 * System.out.println("Record deleted successfully....");
		 * 
		 * service.displayStudents(); } catch (SQLException e) {
		 * System.out.println(e.getMessage()); }
		 */
		UsingCallableStatement service =new UsingCallableStatement();
		try {
			//service.addStudent(9, "Sakshi", 77, 101);
			System.out.println(service.getName(8));
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
