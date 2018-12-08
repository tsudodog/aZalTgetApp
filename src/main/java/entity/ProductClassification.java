
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductClassification {

    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("product_type_name")
    @Expose
    private String productTypeName;
    @SerializedName("item_type_name")
    @Expose
    private String itemTypeName;
    @SerializedName("item_type")
    @Expose
    private ItemType itemType;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

}
