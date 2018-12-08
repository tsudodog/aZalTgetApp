
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("gift_wrapable")
    @Expose
    private String giftWrapable;
    @SerializedName("has_prop65")
    @Expose
    private String hasProp65;
    @SerializedName("is_hazmat")
    @Expose
    private String isHazmat;
    @SerializedName("max_order_qty")
    @Expose
    private Integer maxOrderQty;
    @SerializedName("street_date")
    @Expose
    private String streetDate;
    @SerializedName("media_format")
    @Expose
    private String mediaFormat;
    @SerializedName("merch_class")
    @Expose
    private String merchClass;
    @SerializedName("merch_classid")
    @Expose
    private Integer merchClassid;
    @SerializedName("merch_subclass")
    @Expose
    private Integer merchSubclass;
    @SerializedName("return_method")
    @Expose
    private String returnMethod;

    public String getGiftWrapable() {
        return giftWrapable;
    }

    public void setGiftWrapable(String giftWrapable) {
        this.giftWrapable = giftWrapable;
    }

    public String getHasProp65() {
        return hasProp65;
    }

    public void setHasProp65(String hasProp65) {
        this.hasProp65 = hasProp65;
    }

    public String getIsHazmat() {
        return isHazmat;
    }

    public void setIsHazmat(String isHazmat) {
        this.isHazmat = isHazmat;
    }

    public Integer getMaxOrderQty() {
        return maxOrderQty;
    }

    public void setMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    public String getStreetDate() {
        return streetDate;
    }

    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    public String getMediaFormat() {
        return mediaFormat;
    }

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    public String getMerchClass() {
        return merchClass;
    }

    public void setMerchClass(String merchClass) {
        this.merchClass = merchClass;
    }

    public Integer getMerchClassid() {
        return merchClassid;
    }

    public void setMerchClassid(Integer merchClassid) {
        this.merchClassid = merchClassid;
    }

    public Integer getMerchSubclass() {
        return merchSubclass;
    }

    public void setMerchSubclass(Integer merchSubclass) {
        this.merchSubclass = merchSubclass;
    }

    public String getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

}
