package myRetail;

public class CurrentPrice {


    double value;
    String currencyCode;

    public CurrentPrice(){
        this.value = 0.00;
        this.currencyCode = "USD";
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
