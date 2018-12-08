import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dao.ProductDAOImpl;
import myRetail.MyRetailProduct;
import redsky.Product;
import org.apache.commons.lang3.StringUtils;
import redsky.RedSkyAPI;

import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {
        port(8080);

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
            jso.addProperty("name", redSkyProduct.getProduct().getItem().getProductDescription().getTitle());
            jso.add("current_price", gson.toJsonTree(myRetailProduct.getCurrentPrice()));
            return redSkyProduct == null ? "{\"error\" : \"Product Not Found\"}" : jso.toString();
        });



        put("/products/:productID", (req, res) -> {


            String contentType = req.headers("Content-Type");

            if ("application/json".equals(contentType)) {
                // this is JSON information and can be parsed
                // use GSON to map to Pojo
                ProductDAOImpl productDAO = new ProductDAOImpl();
                Gson gson = new Gson();
                JsonObject jso = gson.fromJson(req.body(), JsonObject.class);
                System.out.println(jso);

//                productDAO.addProduct(incomingProduct);
            }

            return "success?";
        });


        get("/", (req, res) -> {
            return "Server Working";
        });

    }
}
