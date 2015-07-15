package com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.model.Crew;

/**
 * Servlet implementation class edits
 */
@WebServlet("/edits")
public class edits extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json = request.getParameter("crewStats");
		ArrayList<Crew> theCrew = Crew.getjCrew();
		Gson gson = new Gson();
		Crew updatedMember = gson.fromJson(json, Crew.class);
		for(Crew currentCrew : theCrew){
			if(updatedMember.getId() == currentCrew.getId()){
				if(!(updatedMember.getFirstname().equals(currentCrew.getFirstname())) || !(updatedMember.getLastname().equals(currentCrew.getLastname())) || updatedMember.getShare() != currentCrew.getShare()){
					synchronized(this){
						Crew.updateCrew(updatedMember);
						int placement = theCrew.indexOf(currentCrew);
						theCrew.set(placement, updatedMember);
					}
				}
			}
		}
		
	}

}
