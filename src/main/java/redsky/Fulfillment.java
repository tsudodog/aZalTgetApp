
package redsky;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fulfillment {

    @SerializedName("is_po_box_prohibited")
    @Expose
    private Boolean isPoBoxProhibited;
    @SerializedName("po_box_prohibited_message")
    @Expose
    private String poBoxProhibitedMessage;

    public Boolean getIsPoBoxProhibited() {
        return isPoBoxProhibited;
    }

    public void setIsPoBoxProhibited(Boolean isPoBoxProhibited) {
        this.isPoBoxProhibited = isPoBoxProhibited;
    }

    public String getPoBoxProhibitedMessage() {
        return poBoxProhibitedMessage;
    }

    public void setPoBoxProhibitedMessage(String poBoxProhibitedMessage) {
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
    }

}
