package main.entity;

/**
 * @author Yinan Zhang
 */


public class Order {
    private String soupType;
    private String noodleType;
    private String sprOnionType;
    private String nori;
    private String chashu;
    private String boiledEgg;
    private int spicyIndex;
    private double fixedPrice = 9.99; //default price of fixed dishes is 9.99
    private int extraNoriNum;
    private int extraBoilEggNum;
    private int extraBamshootNum;
    private int extraChashuNum;
    private double addOnPrice;
    private String diningOption;
    private String totalPrice;
    private String dateTime;
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

    public String getNori() {
        return nori;
    }

    public void setNori(String nori) {
        this.nori = nori;
    }

    public String getChashu() {
        return chashu;
    }

    public void setChashu(String chashu) {
        this.chashu = chashu;
    }

    public String getBoiledEgg() {
        return boiledEgg;
    }

    public void setBoiledEgg(String boiledEgg) {
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

    public void setFixedPrice(double fixedPrice) {
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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {    //use the date to produce the order number

        this.dateTime = dateTime;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "soupType='" + soupType + '\'' +
                ", noodleType='" + noodleType + '\'' +
                ", sprOnionType='" + sprOnionType + '\'' +
                ", nori='" + nori + '\'' +
                ", chashu='" + chashu + '\'' +
                ", boiledEgg='" + boiledEgg + '\'' +
                ", spicyIndex=" + spicyIndex +
                ", fixedPrice=" + fixedPrice +
                ", extraNoriNum=" + extraNoriNum +
                ", extraBoilEggNum=" + extraBoilEggNum +
                ", extraBamshootNum=" + extraBamshootNum +
                ", extraChashuNum=" + extraChashuNum +
                ", addOnPrice=" + addOnPrice +
                ", diningOption='" + diningOption + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", memberNum='" + memberNum + '\'' +
                '}';
    }
}
