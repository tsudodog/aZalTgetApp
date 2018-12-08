
package redsky;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.bson.types.ObjectId;
import xyz.morphia.annotations.*;

@Entity("products")
@Indexes(
        @Index(value = "itemId", fields = @Field("product.item.tcin"))
)
public class Product {
    @Id
    ObjectId id;


    public Product(){
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
