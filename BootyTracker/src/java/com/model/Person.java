package com.model;

import java.sql.ResultSet;

import com.base.LogFilo;

public class Person
{

	protected int id;	//Primary key in DB Table
	protected String firstname;		//First name
	protected String lastname;		//Last name
	protected String name;          //Add first and last name to get full name
	protected float share;			//Share of booty
	
	public void populateFields(ResultSet dbResultSet){
			
		try{
				setId(dbResultSet.getInt("ID"));
				setFirstname(dbResultSet.getString("fName"));
				setLastname(dbResultSet.getString("lName"));
				setShare(dbResultSet.getFloat("share"));
		}
		catch (Exception e){
			LogFilo.log("User population error: " + e.getMessage());
		}
	}

	//Getters
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getFullName() {
		this.name = firstname + " " + lastname;
		return this.name;
	}
	public float getShare() {
		return share;
	}
	
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setShare(float share) {
		this.share = share;
	}
}
