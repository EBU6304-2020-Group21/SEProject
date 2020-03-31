package main.entity;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderTest {

    Order o=new Order();

    @Test
    public void getSoupType() {assertEquals("Tonkotsu",o.getSoupType());
    }

    @Test
    public void setSoupType() {
        o.setSoupType("Tonkotsu");
        assertEquals("Tonkotsu",o.getSoupType());
    }

    @Test
    public void getNoodleType() {assertEquals("Soft",o.getNoodleType());
    }

    @Test
    public void setNoodleType() {
        o.setNoodleType("Soft");
        assertEquals("Soft",o.getNoodleType());
    }

    @Test
    public void getSprOnionType() {assertEquals("Just a little",o.getSprOnionType());
    }

    @Test
    public void setSprOnionType() {
        o.setSprOnionType("Just a little");
        assertEquals("Just a little",o.getSprOnionType());
    }

    @Test
    public void getNori() { assertEquals(true,o.getNori());
    }

    @Test
    public void setNori() {
        o.setNori(true);
        assertEquals(true,o.getNori());
    }

    @Test
    public void getChashu() {assertEquals(true,o.getChashu());
    }

    @Test
    public void setChashu() {
        o.setChashu(true);
        assertEquals(true,o.getChashu());
    }

    @Test
    public void getBoiledEgg() {assertEquals(true,o.getBoiledEgg());
    }

    @Test
    public void setBoiledEgg() {
        o.setBoiledEgg(true);
        assertEquals(true,o.getBoiledEgg());
    }

    @Test
    public void getSpicyIndex() {assertEquals(5,o.getSpicyIndex() );
    }

    @Test
    public void setSpicyIndex() {
        o.setSpicyIndex(5);
        assertEquals(5,o.getSpicyIndex() );
    }

    @Test
    public void getFixedPrice() {assertEquals(9.99,o.getFixedPrice());
    }

    @Test
    public void setFixedPrice() {
        o.setFixedPrice(9.99);
        assertEquals(9.99,o.getFixedPrice());
    }

    @Test
    public void getExtraNoriNum() {assertEquals(3,o.getExtraNoriNum());
    }

    @Test
    public void setExtraNoriNum() {
        o.setExtraNoriNum(3);
        assertEquals(3,o.getExtraNoriNum());
    }

    @Test
    public void getExtraBoilEggNum() {assertEquals(6,o.getExtraBoilEggNum());
    }

    @Test
    public void setExtraBoilEggNum() {
        o.setExtraBoilEggNum(6);
        assertEquals(6,o.getExtraBoilEggNum());
    }

    @Test
    public void getExtraBamshootNum() {assertEquals(4,o.getExtraBamshootNum());
    }

    @Test
    public void setExtraBamshootNum() {
        o.setExtraBamshootNum(4);
        assertEquals(4,o.getExtraBamshootNum());
    }

    @Test
    public void getExtraChashuNum() { assertEquals(2,o.getExtraChashuNum());
    }

    @Test
    public void setExtraChashuNum() {
        o.setExtraChashuNum(2);
        assertEquals(2,o.getExtraChashuNum());
    }

    @Test
    public void getAddOnPrice() { assertEquals(66.6,o.getAddOnPrice());
    }

    @Test
    public void setAddOnPrice() {
        o.setAddOnPrice(66.6);
        assertEquals(66.6,o.getAddOnPrice());
    }

    @Test
    public void getDiningOption() {assertEquals("Eat in",o.getDiningOption());
    }

    @Test
    public void setDiningOption() {
        o.setDiningOption("Eat in");
        assertEquals("Eat in",o.getDiningOption());
    }

    @Test
    public void getTotalPrice() {assertEquals("131.4",o.getTotalPrice());
    }

    @Test
    public void setTotalPrice() {
        o.setTotalPrice("131.4");
        assertEquals("131.4",o.getTotalPrice());
    }

    @Test
    public void getOrderNum() {assertEquals("yyyyMMddHHmmss",o.getOrderNum());
    }

    @Test
    public void setOrderNum(String dateNowStr) {
        o.setOrderNum();
        assertEquals(dateNowStr,o.getOrderNum());
    }

    @Test
    public void getMemberNum() {assertEquals("7",o.getMemberNum());
    }

    @Test
    public void setMemberNum() {
        o.setMemberNum("7");
        assertEquals("7",o.getMemberNum());
    }
}