
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnvironmentalSegmentation {

    @SerializedName("is_lead_disclosure")
    @Expose
    private Boolean isLeadDisclosure;

    public Boolean getIsLeadDisclosure() {
        return isLeadDisclosure;
    }

    public void setIsLeadDisclosure(Boolean isLeadDisclosure) {
        this.isLeadDisclosure = isLeadDisclosure;
    }

}
