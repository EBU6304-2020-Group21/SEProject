package main.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Yinan Zhang
 * @Date: 2020/5/14 20:27
 */
class ReportTest {
    Report n= new Report();

    @Test
    void getTonkotsuNum() {
        n.setTonkotsuNum(5);
        assertEquals(5,n.getTonkotsuNum());
    }

    @Test
    void getShoyuNum() {
        n.setShoyuNum(8);
        assertEquals(8,n.getShoyuNum());
    }

    @Test
    void getShioNum() {
        n.setShioNum(9);
        assertEquals(9,n.getShioNum());
    }

    @Test
    void getSoftNum() {
        n.setSoftNum(4);
        assertEquals(4,n.getSoftNum());
    }

    @Test
    void getMediumNum() {
        n.setMediumNum(1);
        assertEquals(1,n.getMediumNum());
    }

    @Test
    void getFirmNum() {
        n.setFirmNum(5);
        assertEquals(5,n.getFirmNum());
    }

    @Test
    void getNoNum() {
        n.setNoNum(4);
        assertEquals(4,n.getNoNum());

    }

    @Test
    void getJustNum() {
        n.setJustNum(7);
        assertEquals(7,n.getJustNum());
    }

    @Test
    void getLotNum() {
        n.setLotNum(7);
        assertEquals(7,n.getLotNum());
    }

    @Test
    void getNoriyesNum() {
        n.setNoriyesNum(7);
        assertEquals(7,n.getNoriyesNum());
    }

    @Test
    void getChashuyesNum() {
        n.setChashuyesNum(7);
        assertEquals(7,n.getChashuyesNum());
    }

    @Test
    void getChashunoNum() {
        n.setChashunoNum(7);
        assertEquals(7,n.getChashunoNum());
    }

    @Test
    void getEggyesNum() {
        n.setEggyesNum(7);
        assertEquals(7,n.getEggyesNum());
    }

    @Test
    void getEggnoNum() {
        n.setEggnoNum(8);
        assertEquals(8,n.getEggnoNum());
    }

    @Test
    void getNorinoNum() {
        n.setNorinoNum(7);
        assertEquals(7,n.getNorinoNum());
    }

    @Test
    void getSpi1() {
        n.setSpi1(7);
        assertEquals(7,n.getSpi1());
    }

    @Test
    void getSpi2() {
        n.setSpi2(7);
        assertEquals(7,n.getSpi2());
    }

    @Test
    void getSpi3() {
        n.setSpi3(7);
        assertEquals(7,n.getSpi3());
    }

    @Test
    void getSpi4() {
        n.setSpi4(7);
        assertEquals(7,n.getSpi4());
    }

    @Test
    void getSpi5() {
        n.setSpi5(8);
        assertEquals(8,n.getSpi5());
    }

    @Test
    void getExtraNoriNum() {
        n.setExtraNoriNum(7);
        assertEquals(7,n.getExtraNoriNum());
    }

    @Test
    void getExtraEggNum() {
        n.setExtraEggNum(7);
        assertEquals(7,n.getExtraEggNum());
    }

    @Test
    void getExtraBambooNum() {
        n.setExtraBambooNum(7);
        assertEquals(7,n.getExtraBambooNum());
    }

    @Test
    void getExtraChashuNum() {
        n.setExtraChashuNum(7);
        assertEquals(7,n.getExtraChashuNum());
    }

    @Test
    void getSpi0() {
        n.setSpi0(7);
        assertEquals(7,n.getSpi0());
    }
}