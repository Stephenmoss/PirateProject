package restful.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
 
public class RESTServiceClient {
    public static void main(String[] args) {
    		int x = 5;
    		String num = "";
            try {
                URL url = new URL("http://localhost:8080/Dabloonexchange/api/Service");
                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);
                connection.setRequestProperty("Content-Type", "text/plain");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
                num = Integer.toString(x);
                out.write(num);
                out.close();
 
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                
                num = in.readLine();
                x = Integer.parseInt(num);
                //System.out.println("Total: " + x);
                in.close();
            } catch (Exception e) {
                System.out.println("\nError while calling REST Service");
                System.out.println(e);
            }
    }
}
