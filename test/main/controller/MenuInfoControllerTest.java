package main.controller;

import main.entity.MenuAvailablity;
import main.entity.MenuPrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: Yinan Zhang
 * @Date: 2020/5/9 18:27
 */
class MenuInfoControllerTest {
    @Test
    void genMenuPriceInfo(){
        MenuPrice n= new MenuPrice();
        MenuInfoController zyn= new MenuInfoController();
        n.setExtraBamShootPrice(60.5);
        n.setFixedPrice(8.8);
        n.setExtraBoilEggPrice(8.2);
        n.setExtraChashuPrice(7.05);
        n.setExtraNoriPrice(77.5);
        zyn.updateMenuPriceInfo(n);
        MenuPrice s=new MenuPrice();
        s=zyn.getMenuPriceInfo();
        assertEquals(s.getExtraBamShootPrice(),n.getExtraBamShootPrice());
    }
    @Test
    void genMenuAvailabilityInfo(){
        MenuAvailablity n= new MenuAvailablity();
        MenuAvailablity s= new MenuAvailablity();
        MenuInfoController zyn= new MenuInfoController();
        n.setBamShootAvailable(false);
        n.setBoilEggAvailable(true);
        n.setChashuAvailable(false);
        n.setNoriAvailable(true);
        zyn.updateMenuAvailabilityInfo(n);
        s=zyn.getMenuAvailabilityInfo();
        assertEquals(s.isBamShootAvailable(),n.isBamShootAvailable());
        assertEquals(s.isBoilEggAvailable(),n.isBoilEggAvailable());
        assertEquals(s.isChashuAvailable(),n.isChashuAvailable());
        assertEquals(s.isNoriAvailable(),n.isNoriAvailable());
    }

}