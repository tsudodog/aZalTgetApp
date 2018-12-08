
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DisplayOption {

    @SerializedName("is_size_chart")
    @Expose
    private Boolean isSizeChart;
    @SerializedName("is_warranty")
    @Expose
    private Boolean isWarranty;

    public Boolean getIsSizeChart() {
        return isSizeChart;
    }

    public void setIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
    }

    public Boolean getIsWarranty() {
        return isWarranty;
    }

    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
    }

}
