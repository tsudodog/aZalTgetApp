import com.google.gson.Gson;
import com.mongodb.MongoClient;
import dao.ProductDAOImpl;
import entity.Product;
import mongoDB.MongoConnection;
import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;

import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {
        port(8080);
        MongoClient testClient = MongoConnection.CONNECTION.getClient();
        System.out.println(testClient.getCredential().toString());
        System.out.println("test");

        ProductDAOImpl productDAO = new ProductDAOImpl();
//        Product p = new Product(1, "FluffyDragon Toy", 1010F);
//        productDAO.addProduct(p);
//        Product p2 = productDAO.findProductByProductID(new ObjectId("5c09bacd84150db2f0044074"));
//        System.out.println(p2.getName());
        get("/products/:productID", (req, res) -> {


            String productID = StringUtils.isNumeric(req.params(":productID")) ? req.params(":productID") : "";
            return productID;
        });

        put("/products", (req, res) -> {
            System.out.println("hello?");

            String contentType = req.headers("Content-Type");

            if ("application/json".equals(contentType)) {
                // this is JSON information and can be parsed
                // use GSON to map to Pojo
                Gson gson = new Gson();
                Product incomingProduct = gson.fromJson(req.body(), Product.class);
                productDAO.addProduct(incomingProduct);
            }


//            req.attribute("Content-Type");
//            System.out.println(req.attribute("Content-Type").toString());
            return "success?";
        });


        get("/", (req, res) -> {
            return "Server Working";
        });

    }
}
