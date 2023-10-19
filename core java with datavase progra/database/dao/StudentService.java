package com.tns.database.dao;

import java.sql.SQLException;

public interface StudentService {
	int addStudent(int rollNo, String name, float per, int collegeId) throws SQLException; 
	int deleteStudentByRollNo(int rollNo) throws SQLException;
	int deleteStudentByName(String name) throws SQLException;
	int updateStudentPerByRollNo(int rollNo, float per)throws SQLException;
	void displayStudents() throws SQLException;	
}
