package redsky;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfferPrice {

    @SerializedName("minPrice")
    @Expose
    private Integer minPrice;
    @SerializedName("maxPrice")
    @Expose
    private Integer maxPrice;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("formattedPrice")
    @Expose
    private String formattedPrice;
    @SerializedName("priceType")
    @Expose
    private String priceType;
    @SerializedName("startDate")
    @Expose
    private Integer startDate;
    @SerializedName("endDate")
    @Expose
    private Integer endDate;
    @SerializedName("saveDollar")
    @Expose
    private String saveDollar;
    @SerializedName("savePercent")
    @Expose
    private String savePercent;
    @SerializedName("eyebrow")
    @Expose
    private String eyebrow;
    @SerializedName("null")
    @Expose
    private Boolean _null;

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public String getSaveDollar() {
        return saveDollar;
    }

    public void setSaveDollar(String saveDollar) {
        this.saveDollar = saveDollar;
    }

    public String getSavePercent() {
        return savePercent;
    }

    public void setSavePercent(String savePercent) {
        this.savePercent = savePercent;
    }

    public String getEyebrow() {
        return eyebrow;
    }

    public void setEyebrow(String eyebrow) {
        this.eyebrow = eyebrow;
    }

    public Boolean getNull() {
        return _null;
    }

    public void setNull(Boolean _null) {
        this._null = _null;
    }

}