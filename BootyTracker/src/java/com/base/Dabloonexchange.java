package com.base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Dabloonexchange {

	public static float convert(float input){
		float output = 0;
		String inputString = "";
		String outputString = "";
		try {
	        URL url = new URL("http://localhost:8080/Dabloonexchange/api/Service");
	        //Connect to service
	        URLConnection connection = url.openConnection();
	        connection.setDoOutput(true);
	        connection.setRequestProperty("Content-Type", "text/plain");
	        connection.setConnectTimeout(5000);
	        connection.setReadTimeout(5000);
	        //Send data
	        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
	        inputString = Float.toString(input);
	        out.write(inputString);
	        out.close();
	        //Receive data
	        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        outputString = in.readLine();
	        output = Float.parseFloat(outputString);
	        in.close();
	    
		} catch (Exception e) {
	    	LogFilo.log("Error while calling REST Service: " + e.getMessage());
	    }
		return output;
	}
	
	public static String convert(String inputString){
		String outputString = "";
		try {
	        URL url = new URL("http://localhost:8080/Dabloonexchange/api/Service");
	        //Connect to service
	        URLConnection connection = url.openConnection();
	        connection.setDoOutput(true);
	        connection.setRequestProperty("Content-Type", "text/plain");
	        connection.setConnectTimeout(5000);
	        connection.setReadTimeout(5000);
	        //Send data
	        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
	        out.write(inputString);
	        out.close();
	        //Receive data
	        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        outputString = in.readLine();
	        in.close();
	    
		} catch (Exception e) {
	    	LogFilo.log("Error while calling REST Service: " + e.getMessage());
	    }
		return outputString;
	}
	
}
