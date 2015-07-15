package com.base;

import java.sql.*;

public class DBconn<Static> {
	
	private static  Connection conn;
	private static String address = "172.17.40.21";
	private static String connect_link;
	private static String userid = "conna";
	private static String password = "sewer";

	public DBconn(){
	}
	
	public static void conn(){
		
		try {
			connect_link = "jdbc:jtds:sqlserver://" + address + ":1433/Bootytracker";
			try {
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				LogFilo.log("SQL Driver error: " + e.getMessage());
			}
			conn = DriverManager.getConnection(connect_link, userid, password);					
		}
		catch (Exception e){
			LogFilo.log("SQL connection error: " + e.getMessage());
		}
	}
	
	public static void closeConn(){
		try{
			conn.close();
		}
		catch (Exception e){
			LogFilo.log("SQL closing error: " + e.getMessage());
		}
	}
	
	public static ResultSet query(String query){
		try {
			conn();
			PreparedStatement ps = prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			return rs;
		}
		catch (Exception e){
			LogFilo.log("Query error: " + e.getMessage());
		}		
		return null;
	}
	
	public static PreparedStatement prepareStatement(String query){
		try{
			conn();
			PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			return ps;
		}
		catch (Exception e){
			LogFilo.log("Query error: " + e.getMessage());
		}		
		return null;
	}
}