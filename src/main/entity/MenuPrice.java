package main.entity;

/**
 * @author Yuxuan Wu
 */
public class MenuPrice {
    private double fixedPrice = 9.99;      //the price of fixed dishes, default 9.99 pounds
    private double extraNoriPrice = 1;     //the price of extra Nori, default 1 pounds
    private double extraBoilEggPrice = 1;  //the price of extra boiled eggs, default 1 pounds
    private double extraBamShootPrice = 1; //the price of extra banboo shoot, default 1 pounds
    private double extraChashuPrice = 2;   //the price of extra Chashu, default 2 pounds

    public double getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public double getExtraNoriPrice() {
        return extraNoriPrice;
    }

    public void setExtraNoriPrice(double extraNoriPrice) {
        this.extraNoriPrice = extraNoriPrice;
    }

    public double getExtraBoilEggPrice() {
        return extraBoilEggPrice;
    }

    public void setExtraBoilEggPrice(double extraBoilEggPrice) {
        this.extraBoilEggPrice = extraBoilEggPrice;
    }

    public double getExtraBamShootPrice() {
        return extraBamShootPrice;
    }

    public void setExtraBamShootPrice(double extraBamShootPrice) {
        this.extraBamShootPrice = extraBamShootPrice;
    }

    public double getExtraChashuPrice() {
        return extraChashuPrice;
    }

    public void setExtraChashuPrice(double extraChashuPrice) {
        this.extraChashuPrice = extraChashuPrice;
    }

    @Override
    public String toString() {
        return "MenuPrice{" +
                "fixedPrice=" + fixedPrice +
                ", extraNoriPrice=" + extraNoriPrice +
                ", extraBoilEggPrice=" + extraBoilEggPrice +
                ", extraBamShootPrice=" + extraBamShootPrice +
                ", extraChashuPrice=" + extraChashuPrice +
                '}';
    }
}
