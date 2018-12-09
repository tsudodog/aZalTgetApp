package dao;

import com.mongodb.MongoClient;
import myRetail.MyRetailProduct;
import mongoDB.MongoConnection;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;
import xyz.morphia.query.Query;
import xyz.morphia.query.UpdateOperations;
import xyz.morphia.query.UpdateResults;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    MongoClient mongoClient = MongoConnection.CONNECTION.getClient();
    Datastore datastore = new Morphia().createDatastore(mongoClient, "mdv-target-app");


    public String addProduct(MyRetailProduct product) {
        datastore.save(product);
        return "Product saved Successfully:\t";
    }

    public List<MyRetailProduct> getAllProduct() {
        List<MyRetailProduct> list = datastore.find(MyRetailProduct.class).asList();
        if (list != null) {
            return list;
        }
        return new ArrayList<MyRetailProduct>();
    }

    public MyRetailProduct findProductByProductID(final String productID) {

        return datastore.createQuery(MyRetailProduct.class)
                .field("itemID")
                .equal(productID)
                .asList()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public void updateRetailProduct(MyRetailProduct productToUpdate) {
        final Query<MyRetailProduct> productQuery = datastore.createQuery(MyRetailProduct.class).filter("itemID", productToUpdate.getItemID());
        final UpdateOperations<MyRetailProduct> updateOperations = datastore.createUpdateOperations(MyRetailProduct.class).set("currentPrice", productToUpdate.getCurrentPrice());
        final UpdateResults updateResults = datastore.update(productQuery, updateOperations);
        System.out.println(updateResults.getUpdatedCount());
    }

}
