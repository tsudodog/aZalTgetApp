
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product_ {

    @SerializedName("deep_red_labels")
    @Expose
    private DeepRedLabels deepRedLabels;
    @SerializedName("available_to_promise_network")
    @Expose
    private AvailableToPromiseNetwork availableToPromiseNetwork;
    @SerializedName("item")
    @Expose
    private Item item;

    public DeepRedLabels getDeepRedLabels() {
        return deepRedLabels;
    }

    public void setDeepRedLabels(DeepRedLabels deepRedLabels) {
        this.deepRedLabels = deepRedLabels;
    }

    public AvailableToPromiseNetwork getAvailableToPromiseNetwork() {
        return availableToPromiseNetwork;
    }

    public void setAvailableToPromiseNetwork(AvailableToPromiseNetwork availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
