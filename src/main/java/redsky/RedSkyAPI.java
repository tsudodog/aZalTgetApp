package redsky;

import com.google.gson.Gson;
import jdk.net.SocketFlow;
import myRetail.MyRetailProduct;
import org.eclipse.jetty.http.HttpStatus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class RedSkyAPI {

    public static Product getProductByProductID(final String productID) {
        String urlString = "http://redsky.target.com/v2/pdp/tcin/" + productID + "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
        try {
            URL url = new URL(urlString);
            URLConnection con =  url.openConnection();

            String redirect = con.getHeaderField("Location");
            if(redirect!= null){
                con = new URL(redirect).openConnection();
            }



            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            Gson gson = new Gson();
            return gson.fromJson(content.toString(), Product.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            return new Product();
        }
        return null;
    }

}
