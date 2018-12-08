
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PackageDimensions {

    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("weight_unit_of_measure")
    @Expose
    private String weightUnitOfMeasure;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("depth")
    @Expose
    private String depth;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("dimension_unit_of_measure")
    @Expose
    private String dimensionUnitOfMeasure;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnitOfMeasure() {
        return weightUnitOfMeasure;
    }

    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDimensionUnitOfMeasure() {
        return dimensionUnitOfMeasure;
    }

    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }

}
