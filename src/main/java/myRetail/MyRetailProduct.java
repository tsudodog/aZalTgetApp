package myRetail;

import org.bson.types.ObjectId;
import org.omg.CORBA.Current;
import xyz.morphia.annotations.Entity;

@Entity
public class MyRetailProduct {

    ObjectId id;
    String itemID;
    CurrentPrice currentPrice;
    public MyRetailProduct() {

    }
    public MyRetailProduct(final String itemID){
        this.id = new ObjectId();
        this.itemID = itemID;
        this.currentPrice = new CurrentPrice();

    }


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }
}
