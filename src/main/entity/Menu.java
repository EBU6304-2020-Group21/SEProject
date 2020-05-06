package main.entity;

/**
 * @author Yuxuan Wu
 */
public class Menu {
    private double fixedPrice = 9.99;      //the price of fixed dishes, default 9.99 pounds
    private double extraNoriPrice = 1;     //the price of extra Nori, default 1 pounds
    private double extraBoilEggPrice = 1;  //the price of extra boiled eggs, default 1 pounds
    private double extraBamShootPrice = 1; //the price of extra banboo shoot, default 1 pounds
    private double extraChashuPrice = 2;   //the price of extra Chashu, default 2 pounds
    private boolean isRamenAvailable=true; //set available of the Ramen
    private boolean isTonkotsuAvailable=true;//set available of the Tonkotsu
    private boolean isShoyuAvailable=true;//set available of the Shoyu
    private boolean isShioAvailable=true;//set available of the Shio
    private boolean isNoriAvailable=true;//set available of the Nori
    private boolean isChashuAvailable=true;//set available of the Chashu
    private boolean isBoilEggAvailable=true;//set available of the Boiled egg
    private boolean isBamShootAvailable=true;//set available of the Bamboo shoot

    public boolean isRamenAvailable() {
        return isRamenAvailable;
    }

    public void setRamenAvailable(boolean ramenAvailable) {
        isRamenAvailable = ramenAvailable;
    }

    public boolean isTonkotsuAvailable() {
        return isTonkotsuAvailable;
    }

    public void setTonkotsuAvailable(boolean tonkotsuAvailable) {
        isTonkotsuAvailable = tonkotsuAvailable;
    }

    public boolean isShoyuAvailable() {
        return isShoyuAvailable;
    }

    public void setShoyuAvailable(boolean shoyuAvailable) {
        isShoyuAvailable = shoyuAvailable;
    }

    public boolean isShioAvailable() {
        return isShioAvailable;
    }

    public void setShioAvailable(boolean shioAvailable) {
        isShioAvailable = shioAvailable;
    }

    public boolean isNoriAvailable() {
        return isNoriAvailable;
    }

    public void setNoriAvailable(boolean noriAvailable) {
        isNoriAvailable = noriAvailable;
    }

    public boolean isChashuAvailable() {
        return isChashuAvailable;
    }

    public void setChashuAvailable(boolean chashuAvailable) {
        isChashuAvailable = chashuAvailable;
    }

    public boolean isBoilEggAvailable() {
        return isBoilEggAvailable;
    }

    public void setBoilEggAvailable(boolean boilEggAvailable) {
        isBoilEggAvailable = boilEggAvailable;
    }

    public boolean isBamShootAvailable() {
        return isBamShootAvailable;
    }

    public void setBamShootAvailable(boolean bamShootAvailable) {
        isBamShootAvailable = bamShootAvailable;
    }

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
}
