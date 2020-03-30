package main.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuTest {
    Menu n=new Menu();
    @Test
    void getFixedPrice() {
        assertEquals(9.99,n.getFixedPrice());
    }

    @Test
    void setFixedPrice() {
        n.setFixedPrice(5.5);
        assertEquals(5.5,n.getFixedPrice());
    }


    @Test
    void getExtraNoriPrice() {
        assertEquals(1,n.getExtraNoriPrice());
    }

    @Test
    void setExtraNoriPrice() {
        n.setExtraNoriPrice(22.2);
        assertEquals(22.2,n.getExtraNoriPrice());
    }

    @Test
    void getExtraBoilEggPrice() {
        assertEquals(1,n.getExtraBoilEggPrice());
    }

    @Test
    void setExtraBoilEggPrice() {
        n.setExtraBoilEggPrice(55.8);
        assertEquals(55.8,n.getExtraBoilEggPrice());
    }

    @Test
    void getExtraBamShootPrice() {
        assertEquals(1,n.getExtraBamShootPrice());
    }

    @Test
    void setExtraBamShootPrice() {
        n.setExtraBamShootPrice(258.6);
        assertEquals(258.6,n.getExtraBamShootPrice());
    }

    @Test
    void getExtraChashuPrice() {
        assertEquals(2,n.getExtraChashuPrice());
    }

    @Test
    void setExtraChashuPrice() {
        n.setExtraChashuPrice(880.5);
        assertEquals(880.5,n.getExtraChashuPrice());
    }
}