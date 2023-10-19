package com.tns.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentServiceImplUsingPreaparedStmt implements StudentService {
	static PreparedStatement pst;

	@Override
	public int addStudent(int rollNo, String name, float per, int collegeId) throws SQLException {
		pst = DBUtil.getConnection().prepareStatement("INSERT INTO tstudent VALUES(?,?,?,?)");
		pst.setInt(1, rollNo);
		pst.setString(2, name);
		pst.setFloat(3, per);
		pst.setInt(4, collegeId);
		int n;
		n = pst.executeUpdate();
		return n;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		pst = DBUtil.getConnection().prepareStatement("DELETE FROM tstudent WHERE rollNo=?");
		pst.setInt(1, rollNo);
		int n;
		n = pst.executeUpdate();
		return n;
	}

	@Override
	public int deleteStudentByName(String name) throws SQLException {
		pst = DBUtil.getConnection().prepareStatement("DELETE FROM tstudent WHERE name=?");
		pst.setString(1, name);
		int n;
		n = pst.executeUpdate();
		return n;
	}

	@Override
	public int updateStudentPerByRollNo(int rollNo, float per) throws SQLException {
		pst = DBUtil.getConnection().prepareStatement("UPDATE tstudent SET per=? WHERE rollNo=?");
		pst.setFloat(1, per);
		pst.setInt(2, rollNo);

		int n;
		n = pst.executeUpdate();
		return n;
	}

	@Override
	public void displayStudents() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Percentage ");
		float per=sc.nextFloat();
		pst = DBUtil.getConnection().prepareStatement("SELECT * FROM tstudent WHERE per>=?");
		pst.setFloat(1, per);
		ResultSet rs;
		rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getInt(4));
		}
		rs.close();

	}

}
