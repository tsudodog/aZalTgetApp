
package entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("base_url")
    @Expose
    private String baseUrl;
    @SerializedName("primary")
    @Expose
    private String primary;
    @SerializedName("content_labels")
    @Expose
    private List<ContentLabel> contentLabels = null;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public List<ContentLabel> getContentLabels() {
        return contentLabels;
    }

    public void setContentLabels(List<ContentLabel> contentLabels) {
        this.contentLabels = contentLabels;
    }

}
