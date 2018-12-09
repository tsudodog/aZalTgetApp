package handlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dao.ProductDAO;
import dao.ProductDAOImpl;
import handlers.AbstractRequestHandler;
import myRetail.MyRetailProduct;
import org.apache.commons.lang3.StringUtils;
import redsky.Product;
import redsky.RedSkyAPI;

import java.util.Map;
import java.util.Optional;

public class GetProductHandler extends AbstractRequestHandler<String> {

    private ProductDAO productDAO;

    public GetProductHandler(ProductDAO productDAO) {
        super(String.class, productDAO);
        this.productDAO = productDAO;
    }

    @Override
    protected Answer processImpl(String value, Map<String, String> queryParams) {
        String productID = StringUtils.isNumeric(queryParams.get(":productid")) ? queryParams.get(":productid") : "";
        Product redSkyProduct = RedSkyAPI.getProductByProductID(productID);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        MyRetailProduct myRetailProduct = productDAO.findProductByProductID(productID);
        if(myRetailProduct == null){
            myRetailProduct = new MyRetailProduct(productID);
            productDAO.addProduct(myRetailProduct);
        }
        JsonObject jso = new JsonObject();
        jso.addProperty("name", Optional.of(redSkyProduct.getProduct().getItem().getProductDescription().getTitle()).orElse(""));
        jso.add("current_price", gson.toJsonTree(myRetailProduct.getCurrentPrice()));
        return new Answer(200, redSkyProduct == null ? "{\"error\" : \"Product Not Found\"}" : jso.toString(), Answer.APPLICATION_JSON);
    }

}
