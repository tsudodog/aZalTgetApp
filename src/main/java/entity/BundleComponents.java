
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BundleComponents {

    @SerializedName("is_assortment")
    @Expose
    private Boolean isAssortment;
    @SerializedName("is_kit_master")
    @Expose
    private Boolean isKitMaster;
    @SerializedName("is_standard_item")
    @Expose
    private Boolean isStandardItem;
    @SerializedName("is_component")
    @Expose
    private Boolean isComponent;

    public Boolean getIsAssortment() {
        return isAssortment;
    }

    public void setIsAssortment(Boolean isAssortment) {
        this.isAssortment = isAssortment;
    }

    public Boolean getIsKitMaster() {
        return isKitMaster;
    }

    public void setIsKitMaster(Boolean isKitMaster) {
        this.isKitMaster = isKitMaster;
    }

    public Boolean getIsStandardItem() {
        return isStandardItem;
    }

    public void setIsStandardItem(Boolean isStandardItem) {
        this.isStandardItem = isStandardItem;
    }

    public Boolean getIsComponent() {
        return isComponent;
    }

    public void setIsComponent(Boolean isComponent) {
        this.isComponent = isComponent;
    }

}
