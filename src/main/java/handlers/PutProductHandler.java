package handlers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dao.ProductDAO;
import dao.ProductDAOImpl;
import myRetail.MyRetailProduct;
import org.apache.commons.lang3.StringUtils;
import redsky.Product;

import java.util.Map;

public class PutProductHandler extends AbstractRequestHandler<JsonObject> {
    private ProductDAO productDAO;



    public PutProductHandler(ProductDAO productDAO) {
        super(JsonObject.class, productDAO);
    }

    @Override
    protected Answer processImpl(JsonObject value, Map<String, String> queryParams) {
        String productID = StringUtils.isNumeric(queryParams.get(":productid")) ? queryParams.get(":productid") : "";


//        String contentType = req.headers("Content-Type");

//        if ("application/json".equals(contentType) && StringUtils.isNotEmpty(productID)) {
            // this is JSON information and can be parsed
            // use GSON to map to Pojo
        ProductDAOImpl productDAO = new ProductDAOImpl();
        Gson gson = new Gson();
        JsonObject jso = gson.fromJson(value, JsonObject.class);
        jso.addProperty("itemID", productID);
        productDAO.updateRetailProduct(gson.fromJson(jso, MyRetailProduct.class));
//        }

        return new Answer(200, "update to " + productID + " was successful!");
    }
}
