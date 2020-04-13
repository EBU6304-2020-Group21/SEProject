package main.entity;

/**
 * @author Yinan Zhang
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    Customer c= new Customer();

    @Test
    void getMembershipNum() {
        c.setMembershipNum("123");
        assertEquals("123",c.getMembershipNum());
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