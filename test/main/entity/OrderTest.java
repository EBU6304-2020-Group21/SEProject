package main.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    Order o=new Order();

    @Test
    void getSoupType() {
        o.setSoupType("Tonkotsu");
        assertEquals("Tonkotsu",o.getSoupType());
    }

    @Test
     void setSoupType() {
        o.setSoupType("Tonkotsu");
        assertEquals("Tonkotsu",o.getSoupType());
    }

    @Test
    void getNoodleType() {
        o.setNoodleType("Soft");
        assertEquals("Soft",o.getNoodleType());
    }

    @Test
   void setNoodleType() {
        o.setNoodleType("Soft");
        assertEquals("Soft",o.getNoodleType());
    }

    @Test
     void getSprOnionType() {
        o.setSprOnionType("Just a little");
        assertEquals("Just a little",o.getSprOnionType());
    }

    @Test
     void setSprOnionType() {
        o.setSprOnionType("Just a little");
        assertEquals("Just a little",o.getSprOnionType());
    }

    @Test
     void getNori() {
        o.setNori("ssa");
        assertEquals("ssa",o.getNori());
    }

    @Test
    void setNori() {
        o.setNori("ss");
        assertEquals("ss",o.getNori());
    }

    @Test
     void getChashu() {
        o.setChashu("sss");assertEquals("sss",o.getChashu());
    }

    @Test
     void setChashu() {
        o.setChashu("ss");
        assertEquals("ss",o.getChashu());
    }

    @Test
    void getBoiledEgg() {
        o.setBoiledEgg("ssa");
        assertEquals("ssa",o.getBoiledEgg());
    }

    @Test
     void setBoiledEgg() {
        o.setBoiledEgg("ss");
        assertEquals("ss",o.getBoiledEgg());
    }

    @Test
     void getSpicyIndex() {
        o.setSpicyIndex(5);assertEquals(5,o.getSpicyIndex() );
    }

    @Test
     void setSpicyIndex() {
        o.setSpicyIndex(5);
        assertEquals(5,o.getSpicyIndex() );
    }

    @Test
     void getFixedPrice() {o.setFixedPrice(9.99);assertEquals(9.99,o.getFixedPrice());
    }

    @Test
     void setFixedPrice() {
        o.setFixedPrice(9.99);
        assertEquals(9.99,o.getFixedPrice());
    }

    @Test
     void getExtraNoriNum() { o.setExtraNoriNum(3);assertEquals(3,o.getExtraNoriNum());
    }

    @Test
    void setExtraNoriNum() {
        o.setExtraNoriNum(3);
        assertEquals(3,o.getExtraNoriNum());
    }

    @Test
     void getExtraBoilEggNum() {o.setExtraBoilEggNum(6);assertEquals(6,o.getExtraBoilEggNum());
    }

    @Test
     void setExtraBoilEggNum() {
        o.setExtraBoilEggNum(6);
        assertEquals(6,o.getExtraBoilEggNum());
    }

    @Test
     void getExtraBamshootNum() {o.setExtraBamshootNum(4);assertEquals(4,o.getExtraBamshootNum());
    }

    @Test
     void setExtraBamshootNum() {
        o.setExtraBamshootNum(4);
        assertEquals(4,o.getExtraBamshootNum());
    }

    @Test
     void getExtraChashuNum() { o.setExtraChashuNum(2); assertEquals(2,o.getExtraChashuNum());
    }

    @Test
     void setExtraChashuNum() {
        o.setExtraChashuNum(2);
        assertEquals(2,o.getExtraChashuNum());
    }

    @Test
    void getAddOnPrice() { o.setAddOnPrice(66.6);assertEquals(66.6,o.getAddOnPrice());
    }

    @Test
    void setAddOnPrice() {
        o.setAddOnPrice(66.6);
        assertEquals(66.6,o.getAddOnPrice());
    }

    @Test
    void getDiningOption() {o.setDiningOption("Eat in");assertEquals("Eat in",o.getDiningOption());
    }

    @Test
    void setDiningOption() {
        o.setDiningOption("Eat in");
        assertEquals("Eat in",o.getDiningOption());
    }

    @Test
     void getTotalPrice() {o.setTotalPrice("131.4");assertEquals("131.4",o.getTotalPrice());
    }

    @Test
     void setTotalPrice() {
        o.setTotalPrice("131.4");
        assertEquals("131.4",o.getTotalPrice());
    }

    @Test
     void getOrderNum() {

        o.setDateTime("123");
        assertEquals("123",o.getDateTime());
    }
    @Test
   void getMemberNum() {o.setMemberNum("7");assertEquals("7",o.getMemberNum());
    }

    @Test
    void setMemberNum() {
        o.setMemberNum("7");
        assertEquals("7",o.getMemberNum());
    }
}
