
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductVendor {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("manufacturer_style")
    @Expose
    private String manufacturerStyle;
    @SerializedName("vendor_name")
    @Expose
    private String vendorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturerStyle() {
        return manufacturerStyle;
    }

    public void setManufacturerStyle(String manufacturerStyle) {
        this.manufacturerStyle = manufacturerStyle;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

}
