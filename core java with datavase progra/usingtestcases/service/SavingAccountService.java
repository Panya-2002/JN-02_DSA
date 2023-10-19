package com.tns.testcasedatabaseexample.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tns.testcasedatabaseexample.dao.DBUtil;
import com.tns.testcasedatabaseexample.entities.SavingAccount;

public class SavingAccountService {
	private PreparedStatement ps = null;
	private Connection con = null;
	private ResultSet rs = null;

	public SavingAccountService() {
		con = DBUtil.getConnection();
	}

	public SavingAccount get(int accNo) {
		SavingAccount sa = null;

		try {
			if (validateAccount(accNo))
			{
			ps = con.prepareStatement("SELECT * From savingaccount WHERE accNo=?");
			ps.setInt(1, accNo);
			rs = ps.executeQuery();
			if (rs.next())
				sa = new SavingAccount(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			}
		} catch (Exception e) {
			System.err.println("Unable to fetch the data");
			return null;
		}
		
		return sa;
	}

	// function to Validate the Account No
	public boolean validateAccount(int accNo) {
		boolean status;
		try {
			ps = con.prepareStatement("SELECT balance From savingaccount WHERE accNo=?");
			ps.setInt(1, accNo);
			rs = ps.executeQuery();
			if (rs.next()) {
				// bal = rs.getInt(1);
				status = true;
			} else {
				System.err.println("No such account");
				status = false;
			}
		} catch (Exception e) {
			System.err.println("Unable to fetch the data");
			status = false;
		}
		return status;
	}

	public int getBal(int accNo) {
		int bal = -1;
		try {
			if (validateAccount(accNo)) {
				System.out.println("----");
				ps = con.prepareStatement("SELECT balance From savingaccount WHERE accNo=?");
				ps.setInt(1, accNo);
				rs = ps.executeQuery();
				if (rs.next())
					bal = rs.getInt(1);
			}
		} catch (Exception e) {
			System.err.println("Unable to fetch the data");
		}
		return bal;
	}

	public void withdraw(int accNo, int amt) {
		int accBal = getBal(accNo);
		if (accBal != -1) {
			try {
				if ((accBal - amt) < 1000) {
					throw new Exception("Not sufficient  balance to withdraw");
				} else
					accBal = accBal - amt;
				ps = con.prepareStatement("UPDATE savingaccount SET balance=? WHERE accNo=?");
				ps.setInt(1, accBal);
				ps.setInt(2, accNo);
				int i = ps.executeUpdate();
				System.out.println(i + " row is updated");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		}
	}

	public void deposit(int accNo, int amt) throws Exception {
		int accBal = getBal(accNo);
		try {
			if (amt > 25000) {
				throw new Exception(amt + "Amount exceeds daily limit");
			}
			accBal = accBal + amt;
			ps = con.prepareStatement("UPDATE savingaccount SET balance=? where accNo=?");
			ps.setInt(1, accBal);
			ps.setInt(2, accNo);
			int i = ps.executeUpdate();
			System.out.println(i + " row is updated");
		} catch (Exception e) {
			throw new Exception(amt + " Amount exceeds daily limit 25000");
		}
	}

	public void transferAmount(int wAcct, int dAcct, int amt) {
		if (validateAccount(wAcct) && validateAccount(dAcct)) {

			try {
				con.setAutoCommit(false);
				withdraw(wAcct, amt);
				deposit(dAcct, amt);
				con.commit();

			} catch (Exception e) {
				try {
					con.rollback();
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				System.out.println("Unable to complete transaction at this moment");
			}
		}
	}

}
