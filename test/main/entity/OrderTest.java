package main.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order o=new Order();

    @Test
    void getSoupType() {assertEquals("Tonkotsu",o.getSoupType());
    }

    @Test
     void setSoupType() {
        o.setSoupType("Tonkotsu");
        assertEquals("Tonkotsu",o.getSoupType());
    }

    @Test
    void getNoodleType() {assertEquals("Soft",o.getNoodleType());
    }

    @Test
   void setNoodleType() {
        o.setNoodleType("Soft");
        assertEquals("Soft",o.getNoodleType());
    }

    @Test
     void getSprOnionType() {assertEquals("Just a little",o.getSprOnionType());
    }

    @Test
     void setSprOnionType() {
        o.setSprOnionType("Just a little");
        assertEquals("Just a little",o.getSprOnionType());
    }

    @Test
     void getNori() { assertEquals(true,o.getNori());
    }

    @Test
    void setNori() {
        o.setNori(true);
        assertEquals(true,o.getNori());
    }

    @Test
     void getChashu() {assertEquals(true,o.getChashu());
    }

    @Test
     void setChashu() {
        o.setChashu(true);
        assertEquals(true,o.getChashu());
    }

    @Test
    void getBoiledEgg() {assertEquals(true,o.getBoiledEgg());
    }

    @Test
     void setBoiledEgg() {
        o.setBoiledEgg(true);
        assertEquals(true,o.getBoiledEgg());
    }

    @Test
     void getSpicyIndex() {assertEquals(5,o.getSpicyIndex() );
    }

    @Test
     void setSpicyIndex() {
        o.setSpicyIndex(5);
        assertEquals(5,o.getSpicyIndex() );
    }

    @Test
     void getFixedPrice() {assertEquals(9.99,o.getFixedPrice());
    }

    @Test
     void setFixedPrice() {
        o.setFixedPrice(9.99);
        assertEquals(9.99,o.getFixedPrice());
    }

    @Test
     void getExtraNoriNum() {assertEquals(3,o.getExtraNoriNum());
    }

    @Test
    void setExtraNoriNum() {
        o.setExtraNoriNum(3);
        assertEquals(3,o.getExtraNoriNum());
    }

    @Test
     void getExtraBoilEggNum() {assertEquals(6,o.getExtraBoilEggNum());
    }

    @Test
     void setExtraBoilEggNum() {
        o.setExtraBoilEggNum(6);
        assertEquals(6,o.getExtraBoilEggNum());
    }

    @Test
     void getExtraBamshootNum() {assertEquals(4,o.getExtraBamshootNum());
    }

    @Test
     void setExtraBamshootNum() {
        o.setExtraBamshootNum(4);
        assertEquals(4,o.getExtraBamshootNum());
    }

    @Test
     void getExtraChashuNum() { assertEquals(2,o.getExtraChashuNum());
    }

    @Test
     void setExtraChashuNum() {
        o.setExtraChashuNum(2);
        assertEquals(2,o.getExtraChashuNum());
    }

    @Test
    void getAddOnPrice() { assertEquals(66.6,o.getAddOnPrice());
    }

    @Test
    void setAddOnPrice() {
        o.setAddOnPrice(66.6);
        assertEquals(66.6,o.getAddOnPrice());
    }

    @Test
    void getDiningOption() {assertEquals("Eat in",o.getDiningOption());
    }

    @Test
    void setDiningOption() {
        o.setDiningOption("Eat in");
        assertEquals("Eat in",o.getDiningOption());
    }

    @Test
     void getTotalPrice() {assertEquals("131.4",o.getTotalPrice());
    }

    @Test
     void setTotalPrice() {
        o.setTotalPrice("131.4");
        assertEquals("131.4",o.getTotalPrice());
    }

    @Test
     void getOrderNum() {assertEquals("yyyyMMddHHmmss",o.getOrderNum());
    }

    @Test
     void setOrderNum(String dateNowStr) {
        o.setOrderNum();
        assertEquals(dateNowStr,o.getOrderNum());
    }

    @Test
   void getMemberNum() {assertEquals("7",o.getMemberNum());
    }

    @Test
    void setMemberNum() {
        o.setMemberNum("7");
        assertEquals("7",o.getMemberNum());
    }
}
