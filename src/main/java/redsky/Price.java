package redsky;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("partNumber")
    @Expose
    private String partNumber;
    @SerializedName("channelAvailability")
    @Expose
    private String channelAvailability;
    @SerializedName("listPrice")
    @Expose
    private ListPrice listPrice;
    @SerializedName("offerPrice")
    @Expose
    private OfferPrice offerPrice;
    @SerializedName("ppu")
    @Expose
    private String ppu;
    @SerializedName("mapPriceFlag")
    @Expose
    private String mapPriceFlag;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getChannelAvailability() {
        return channelAvailability;
    }

    public void setChannelAvailability(String channelAvailability) {
        this.channelAvailability = channelAvailability;
    }

    public ListPrice getListPrice() {
        return listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public OfferPrice getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(OfferPrice offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getPpu() {
        return ppu;
    }

    public void setPpu(String ppu) {
        this.ppu = ppu;
    }

    public String getMapPriceFlag() {
        return mapPriceFlag;
    }

    public void setMapPriceFlag(String mapPriceFlag) {
        this.mapPriceFlag = mapPriceFlag;
    }

}