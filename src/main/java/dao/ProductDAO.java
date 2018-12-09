package dao;

import myRetail.MyRetailProduct;
import xyz.morphia.query.UpdateResults;

import java.util.List;

public interface ProductDAO {
    String addProduct(MyRetailProduct product);

    List<MyRetailProduct> getAllProduct();

    MyRetailProduct findProductByProductID(final String productID);

    UpdateResults updateRetailProduct(MyRetailProduct productToUpdate);
}
