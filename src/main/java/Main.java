import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dao.ProductDAOImpl;
import myRetail.MyRetailProduct;
import redsky.Product;
import org.apache.commons.lang3.StringUtils;
import redsky.RedSkyAPI;

import java.util.Optional;

import static spark.Spark.*;
public class Main {


    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            Integer i =  Integer.parseInt(processBuilder.environment().get("PORT"));
            System.out.println(i);
            return i;
        }
        return 8080;
    }

    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/products/:productID", (req, res) -> {
            String productID = StringUtils.isNumeric(req.params(":productID")) ? req.params(":productID") : "";
            System.out.println("productID \t"+productID);
            Product redSkyProduct = RedSkyAPI.getProductByProductID(productID);
            ProductDAOImpl productDAO = new ProductDAOImpl();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            MyRetailProduct myRetailProduct = productDAO.findProductByProductID(productID);
            if(myRetailProduct == null){
                myRetailProduct = new MyRetailProduct(productID);
                productDAO.addProduct(myRetailProduct);
            }
            JsonObject jso = new JsonObject();
            jso.addProperty("name", Optional.of(redSkyProduct.getProduct().getItem().getProductDescription().getTitle()).orElse(""));
            jso.add("current_price", gson.toJsonTree(myRetailProduct.getCurrentPrice()));
            return redSkyProduct == null ? "{\"error\" : \"Product Not Found\"}" : jso.toString();
        });



        put("/products/:productID", (req, res) -> {
            String productID = StringUtils.isNumeric(req.params(":productID")) ? req.params(":productID") : "";


            String contentType = req.headers("Content-Type");

            if ("application/json".equals(contentType) && StringUtils.isNotEmpty(productID)) {
                // this is JSON information and can be parsed
                // use GSON to map to Pojo
                ProductDAOImpl productDAO = new ProductDAOImpl();
                Gson gson = new Gson();
                JsonObject jso = gson.fromJson(req.body(), JsonObject.class);
                jso.addProperty("itemID", productID);
                productDAO.updateRetailProduct(gson.fromJson(jso, MyRetailProduct.class));
            }

            return "update to " +  productID+ " was successful!";
        });


        get("/", (req, res) -> {
            return "Server Working";
        });

    }
}
