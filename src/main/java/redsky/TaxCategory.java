
package redsky;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaxCategory {

    @SerializedName("tax_class")
    @Expose
    private String taxClass;
    @SerializedName("tax_code_id")
    @Expose
    private Integer taxCodeId;
    @SerializedName("tax_code")
    @Expose
    private String taxCode;

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public Integer getTaxCodeId() {
        return taxCodeId;
    }

    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

}
