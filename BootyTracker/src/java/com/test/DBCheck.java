package com.test;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.base.DBconn;

public class DBCheck {

	@Test
	public void test() {
		String query = "Select * FROM Crew";
		try{
			PreparedStatement ps = DBconn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			rs.next();
			assertEquals("Brian", rs.getString("fName"));
		}
		catch(Exception e){}
	}

}
