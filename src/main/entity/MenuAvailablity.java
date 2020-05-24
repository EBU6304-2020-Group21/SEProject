package main.entity;

/**
 * This Class is for the Menu' availability. It includes all of the attributes of the Menu availability entity.
 * It is used for management system to set Menu availability.
 * @ClassName MenuAvailability
 * @author Yuxuan Wu
 * @version 3.0
 * @date : 2020-05-07 20:29
 **/
public class MenuAvailablity {
    private boolean isRamenAvailable = true; //set available of the Ramen
    private boolean isTonkotsuAvailable = true;//set available of the Tonkotsu
    private boolean isShoyuAvailable = true;//set available of the Shoyu
    private boolean isShioAvailable = true;//set available of the Shio
    private boolean isNoriAvailable = true;//set available of the Nori
    private boolean isChashuAvailable = true;//set available of the Chashu
    private boolean isBoilEggAvailable = true;//set available of the Boiled egg
    private boolean isBamShootAvailable = true;//set available of the Bamboo shoot

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

    @Override
    public String toString() {
        return "MenuAvailablity{" +
                "isRamenAvailable=" + isRamenAvailable +
                ", isTonkotsuAvailable=" + isTonkotsuAvailable +
                ", isShoyuAvailable=" + isShoyuAvailable +
                ", isShioAvailable=" + isShioAvailable +
                ", isNoriAvailable=" + isNoriAvailable +
                ", isChashuAvailable=" + isChashuAvailable +
                ", isBoilEggAvailable=" + isBoilEggAvailable +
                ", isBamShootAvailable=" + isBamShootAvailable +
                '}';
    }
}
