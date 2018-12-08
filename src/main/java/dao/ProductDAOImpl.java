package dao;

import com.mongodb.MongoClient;
import entity.Product;
import mongoDB.MongoConnection;
import org.bson.types.ObjectId;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl {

    MongoClient mongoClient = MongoConnection.CONNECTION.getClient();
    Datastore datastore = new Morphia().createDatastore(mongoClient, "mdv-target-app");

    public String addProduct(Product product) {
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

    public Product findProductByProductID(final String productID){

        return datastore.createQuery(Product.class)
                .field("product.item.tcin")
                .equal(productID)
                .asList()
                .stream()
                .findFirst()
                .orElse(null);
    }

}
