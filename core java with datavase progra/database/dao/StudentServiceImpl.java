package com.tns.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentServiceImpl implements StudentService{
	static Statement st;
	static
	{
		try {
			st=DBUtil.getConnection().createStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public int addStudent(int rollNo, String name, float per, int collegeId) throws SQLException{
		int n;
		n=st.executeUpdate("INSERT INTO tstudent VALUES("+rollNo+",'"+name+"',"+per+","+collegeId+")");
		return n;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		int n;
		n=st.executeUpdate("DELETE FROM tstudent WHERE rollNo="+rollNo);
		return n;
	}

	@Override
	public int deleteStudentByName(String name) throws SQLException {
		int n;
		n=st.executeUpdate("DELETE FROM tstudent WHERE name ='"+name+"'");
		return n;
	}

	@Override
	public int updateStudentPerByRollNo(int rollNo, float per) throws SQLException{
		int n;
		n=st.executeUpdate("UPDATE tstudent SET per="+per+" WHERE rollNo="+rollNo);
		return n;
	}

	@Override
	public void displayStudents() throws SQLException{
		ResultSet rs;
		rs=st.executeQuery("SELECT * FROM tstudent");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
		}
		rs.close();
		
		
	}

}
