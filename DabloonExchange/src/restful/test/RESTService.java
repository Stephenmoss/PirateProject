package restful.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;


@Path("/Service")
public class RESTService {
	@POST
	@Path("/")
	@Consumes(MediaType.TEXT_PLAIN)
	public String thisREST(InputStream incomingData) {
		double i = 0;
		String num = "";
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			num = in.readLine();
			i = Double.parseDouble(num);
			i = i / 10;
			num = String.valueOf(i);
		}catch(Exception e){
			System.out.println("Error Parsing: - " + e.getMessage());
		}
		return num;
	}
	
	@GET
	@Path("{num}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String thatREST(@PathParam("num") String num){
		double i = Double.parseDouble(num);
		i = i / 10;
		num = String.valueOf(i);
		return num;
	}
}
