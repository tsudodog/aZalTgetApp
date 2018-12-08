package dao;

import com.mongodb.MongoClient;
import myRetail.MyRetailProduct;
import redsky.Product;
import mongoDB.MongoConnection;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl {

    MongoClient mongoClient = MongoConnection.CONNECTION.getClient();
    Datastore datastore = new Morphia().createDatastore(mongoClient, "mdv-target-app");

    public String addProduct(MyRetailProduct product) {
        datastore.save(product);
        return "Product saved Successfully:\t";
    }

    public List<Product> getAllProduct(){
        List<Product> list = datastore.find(Product.class).asList();
        if(list!=null){
            return list;
        }
        return new ArrayList<Product>();
    }

    public MyRetailProduct findProductByProductID(final String productID){

        return datastore.createQuery(MyRetailProduct.class)
                .field("itemID")
                .equal(productID)
                .asList()
                .stream()
                .findFirst()
                .orElse(null);
    }

}
