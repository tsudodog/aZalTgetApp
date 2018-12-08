
package redsky;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnPolicies {

    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("policyDays")
    @Expose
    private String policyDays;
    @SerializedName("guestMessage")
    @Expose
    private String guestMessage;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPolicyDays() {
        return policyDays;
    }

    public void setPolicyDays(String policyDays) {
        this.policyDays = policyDays;
    }

    public String getGuestMessage() {
        return guestMessage;
    }

    public void setGuestMessage(String guestMessage) {
        this.guestMessage = guestMessage;
    }

}
