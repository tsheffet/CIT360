package httpurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Connect {
     public static void main(String[] args) {
        try {
          
            URL url = new URL("https://www.byui.edu");
            URLConnection urlCon = url.openConnection(); 
            urlCon.setDoOutput(true);
            urlCon.connect();
            
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(urlCon.getInputStream()));
            
           
            String line = "";
           while (line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
          inputStream.close();
            
        } catch(MalformedURLException e) {
            System.out.println("Bad URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}