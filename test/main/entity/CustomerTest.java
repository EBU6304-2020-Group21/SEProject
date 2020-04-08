package main.entity;

/**
 * @author Yinan Zhang
 */

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    Customer c= new Customer();

    @Test
    void getMembershipNum() {
        c.setMembershipNum();
        long currentTime=new Date().getTime();
        String time = Long.toString(currentTime);
        String tt = time.substring(3,11);
        assertEquals(tt,c.getMembershipNum());
    }


    @Test
    void getFirstName() {
        c.setFirstName("zyn");
        assertEquals("zyn",c.getFirstName());
    }


    @Test
    void getSurname() {
        c.setSurname("wyx");
        assertEquals("wyx",c.getSurname());
    }

    @Test
    void getEmail() {
        c.setEmail("8516541612@qq.com");
        assertEquals("8516541612@qq.com",c.getEmail());
    }

    @Test
    void getMobileNum() {
        c.setMobileNum("13994873094");
        assertEquals("13994873094",c.getMobileNum());
    }

    @Test
    void getStamps() {
        c.setStamps(8);
        assertEquals(8,c.getStamps());
    }

}