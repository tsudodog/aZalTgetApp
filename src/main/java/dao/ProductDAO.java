package dao;

import myRetail.MyRetailProduct;

import java.util.List;

public interface ProductDAO {
    String addProduct(MyRetailProduct product);

    List<MyRetailProduct> getAllProduct();

    MyRetailProduct findProductByProductID(final String productID);

    void updateRetailProduct(MyRetailProduct productToUpdate);
}
