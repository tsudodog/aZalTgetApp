
package redsky;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductBrand {

    @SerializedName("brand")
    @Expose
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
