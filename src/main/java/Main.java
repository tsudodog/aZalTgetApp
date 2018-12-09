import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dao.ProductDAO;
import dao.ProductDAOImpl;
import handlers.GetProductHandler;
import handlers.PutProductHandler;
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
        ProductDAO productDAO2 = new ProductDAOImpl();

        get("/experiment/:productid", new GetProductHandler(productDAO2));
        get("/products/:productID", new GetProductHandler(productDAO2));

        put("/experiment/:productid", new PutProductHandler(productDAO2));

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


        notFound("<html><body><h1>You seem to be lost!</h1></body></html>");
//        internalServerError("<html><body><h1>Fail Whale goes splat!</h1></body></html>");

    }
}
