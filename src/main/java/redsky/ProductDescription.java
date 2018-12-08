
package redsky;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductDescription {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("bullet_description")
    @Expose
    private List<String> bulletDescription = null;
    @SerializedName("general_description")
    @Expose
    private String generalDescription;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

    public String getGeneralDescription() {
        return generalDescription;
    }

    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
    }

}
