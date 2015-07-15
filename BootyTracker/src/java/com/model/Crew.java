package com.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.base.DBconn;
import com.base.LogFilo;

public class Crew extends Person {
	
	private volatile static ArrayList<Crew> jCrew;
	
	public static ArrayList<Crew> buildCrew(){
		ArrayList<Crew> currentCrew = new ArrayList<>();
		String query = "SELECT * FROM Crew";
		try{
			ResultSet rs = DBconn.query(query);
			while(rs.next()){
				Crew currrentMember = new Crew();
				currrentMember.populateFields(rs);
				currentCrew.add(currrentMember);
		}
		}catch(Exception e){
			LogFilo.log("Crew Building Error: " + e.getMessage());
		}
		return currentCrew;
	}
	
	public static void updateCrew(Crew updatedMember){
		String updateQuery = "UPDATE Crew SET fName=?, lName=?, share=? WHERE ID=?";
		if(updatedMember != null){
			try{
				PreparedStatement upPs = DBconn.prepareStatement(updateQuery);
				upPs.setString(1, updatedMember.getFirstname());
				upPs.setString(2, updatedMember.getLastname());
				upPs.setFloat(3, updatedMember.getShare());
				upPs.setInt(4, updatedMember.getId());
				upPs.execute();
			}catch(Exception e){
				LogFilo.log("Crew updating Error: " + e.getMessage());
			}
		}
	}

	public static void initjCrew(){
		jCrew = new ArrayList<Crew>();
	}
	
	public static ArrayList<Crew> getjCrew() {
		return jCrew;
	}

	public static void setjCrew(ArrayList<Crew> jCrew) {
		initjCrew();
		Crew.jCrew = jCrew;
	}
}
