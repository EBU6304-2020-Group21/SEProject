package main.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Yinan Zhang
 * @Date: 2020/5/9 16:19
 */
class MenuAvailablityTest {
    MenuAvailablity n= new MenuAvailablity();

    @Test
    void isRamenAvailable() {
        n.setRamenAvailable(false);
        assertEquals(n.isRamenAvailable(),false);

    }

    @Test
    void isTonkotsuAvailable() {
        n.setTonkotsuAvailable(false);
        assertEquals(n.isTonkotsuAvailable(),false);
    }

    @Test
    void isShoyuAvailable() {
        n.setShoyuAvailable(false);
        assertEquals(n.isShoyuAvailable(),false);
    }

    @Test
    void isShioAvailable() {
        n.setShioAvailable(false);
        assertEquals(n.isShioAvailable(),false );
    }

    @Test
    void isNoriAvailable() {
        n.setNoriAvailable(false);
        assertEquals(n.isNoriAvailable(),false);
    }

    @Test
    void isChashuAvailable() {
        n.setChashuAvailable(false);
        assertEquals(n.isChashuAvailable(),false);
    }


    @Test
    void isBoilEggAvailable() {
        n.setBoilEggAvailable(false);
        assertEquals(n.isBoilEggAvailable(),false);
    }



    @Test
    void isBamShootAvailable() {
        n.setBamShootAvailable(false);
        assertEquals(n.isBamShootAvailable(),false);
    }


}