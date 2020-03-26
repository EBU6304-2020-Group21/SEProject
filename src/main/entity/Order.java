package main.entity;

/**
 * @author Yinan Zhang
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private String soupType;
    private String noodleType;
    private String sprOnionType;
    private Boolean nori;
    private Boolean chashu;
    private Boolean boiledEgg;
    private int spicyIndex;
    private double fixedPrice;
    private int extraNoriNum;
    private int extraBoilEggNum;
    private int extraBamshootNum;
    private int extraChashuNum;
    private double addOnPrice;
    private String diningOption;
    private String totalPrice;
    private String orderNum;
    private String memberNum;

    public String getSoupType() {
        return soupType;
    }

    public void setSoupType(String soupType) {
        this.soupType = soupType;
    }

    public String getNoodleType() {
        return noodleType;
    }

    public void setNoodleType(String noodleType) {
        this.noodleType = noodleType;
    }

    public String getSprOnionType() {
        return sprOnionType;
    }

    public void setSprOnionType(String sprOnionType) {
        this.sprOnionType = sprOnionType;
    }

    public Boolean getNori() {
        return nori;
    }

    public void setNori(Boolean nori) {
        this.nori = nori;
    }

    public Boolean getChashu() {
        return chashu;
    }

    public void setChashu(Boolean chashu) {
        this.chashu = chashu;
    }

    public Boolean getBoiledEgg() {
        return boiledEgg;
    }

    public void setBoiledEgg(Boolean boiledEgg) {
        this.boiledEgg = boiledEgg;
    }

    public int getSpicyIndex() {
        return spicyIndex;
    }

    public void setSpicyIndex(int spicyIndex) {
        this.spicyIndex = spicyIndex;
    }

    public double getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice() {
        double fixedPrice=9.9;           //the price of fixed dishes, default 9.99 pounds
        this.fixedPrice = fixedPrice;
    }

    public int getExtraNoriNum() {
        return extraNoriNum;
    }

    public void setExtraNoriNum(int extraNoriNum) {
        this.extraNoriNum = extraNoriNum;
    }

    public int getExtraBoilEggNum() {
        return extraBoilEggNum;
    }

    public void setExtraBoilEggNum(int extraBoilEggNum) {
        this.extraBoilEggNum = extraBoilEggNum;
    }

    public int getExtraBamshootNum() {
        return extraBamshootNum;
    }

    public void setExtraBamshootNum(int extraBamshootNum) {
        this.extraBamshootNum = extraBamshootNum;
    }

    public int getExtraChashuNum() {
        return extraChashuNum;
    }

    public void setExtraChashuNum(int extraChashuNum) {
        this.extraChashuNum = extraChashuNum;
    }

    public double getAddOnPrice() {
        return addOnPrice;
    }

    public void setAddOnPrice(double addOnPrice) {
        this.addOnPrice = addOnPrice;
    }

    public String getDiningOption() {
        return diningOption;
    }

    public void setDiningOption(String diningOption) {
        this.diningOption = diningOption;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum() {    //use the date to produce the order number
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        this.orderNum = dateNowStr;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

}
