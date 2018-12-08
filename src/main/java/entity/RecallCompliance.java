
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecallCompliance {

    @SerializedName("is_product_recalled")
    @Expose
    private Boolean isProductRecalled;

    public Boolean getIsProductRecalled() {
        return isProductRecalled;
    }

    public void setIsProductRecalled(Boolean isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
    }

}
