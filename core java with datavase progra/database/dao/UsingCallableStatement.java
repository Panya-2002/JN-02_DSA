package com.tns.database.dao;

import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.concurrent.Callable;

import com.mysql.cj.jdbc.CallableStatement;

public class UsingCallableStatement implements StudentService {
	static CallableStatement cst;

	@Override
	public int addStudent(int rollNo, String name, float per, int collegeId) throws SQLException {
		
		cst.setInt(1, rollNo);
		cst.setString(2, name);
		cst.setFloat(3, per);cst = (CallableStatement) DBUtil.getConnection().prepareCall("call addStudent(?,?,?,?)");
		cst.setInt(4, collegeId);
		if (cst.execute() == true)
			return 1;
		else
			return 0;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudentByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudentPerByRollNo(int rollNo, float per) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayStudents() throws SQLException {
		// TODO Auto-generated method stub

	}
	
	public String getName(int RollNo) throws SQLException 
	{
		cst = (CallableStatement) DBUtil.getConnection().prepareCall("{? = call getName(?)}");
		cst.setInt(2, RollNo);
		cst.registerOutParameter(1,java.sql.Types.VARCHAR);
		cst.execute();
		return cst.getString(1);
		
	}
}
