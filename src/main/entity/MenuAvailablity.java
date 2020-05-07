package main.entity;

/**
 * <h3>SEProject</h3>
 * <p>Entity class for menu availability</p>
 *
 * @author : Yuxuan Wu
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
}
