package main.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuTest {

    @Test
    void getFixedPrice() {
        Menu n=new Menu();
        assertEquals(9.99,n.getFixedPrice());
    }

    @Test
    void setFixedPrice() {
        Menu n=new Menu();
        n.setFixedPrice(5.5);
        assertEquals(5.5,n.getFixedPrice());
    }

    @Test
    void testGetFixedPrice() {
    }

    @Test
    void testSetFixedPrice() {
    }

    @Test
    void getExtraNoriPrice() {
    }

    @Test
    void setExtraNoriPrice() {
    }

    @Test
    void getExtraBoilEggPrice() {
    }

    @Test
    void setExtraBoilEggPrice() {
    }

    @Test
    void getExtraBamShootPrice() {
    }

    @Test
    void setExtraBamShootPrice() {
    }

    @Test
    void getExtraChashuPrice() {
    }

    @Test
    void setExtraChashuPrice() {
    }
}