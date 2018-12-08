
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bson.types.ObjectId;
import xyz.morphia.annotations.Id;

public class Product {
    @Id
    ObjectId id;


    Product(){
        this.id = new ObjectId();
    }

    @SerializedName("product")
    @Expose
    private Product_ product;

    public Product_ getProduct() {
        return product;
    }

    public void setProduct(Product_ product) {
        this.product = product;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
