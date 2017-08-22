/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicaddressbook;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author waheedrafiq
 */
public class PeopleTest {
    
    public PeopleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of PrintDetails method, of class People.
     */
    @Before
    public void PrintDetails(){
        System.out.println("Printing details...");
    }
    @Test
    public void testPrintDetails() {
        System.out.println("PrintDetails");
        People instance = new PeopleImpl();
        instance.PrintDetails();
       
        
    }

    /**
     * Test of getFname method, of class People.
     */
    @Test
    public void testGetFname() {
        System.out.println("getFname");
        People instance = new PeopleImpl();
        String expResult = "Waheed";
        instance.setFname(expResult);
        String result = instance.getFname();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setFname method, of class People.
     */
    @Test
    public void testSetFname() {
        System.out.println("setFname");
        String fname = "Waheed";
        People instance = new PeopleImpl();
        instance.setFname(fname);
        
        assertEquals("Waheed",instance.getFname());
        
      
    }

    /**
     * Test of getLastname method, of class People.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        People instance = new PeopleImpl();
        String expResult = "Rafiq";
        instance.setLastname(expResult);
        String result = instance.getLastname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLastname method, of class People.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "Rafiq";
        People instance = new PeopleImpl();
        instance.setLastname(lastname);
     
        assertEquals(lastname,instance.getLastname());
    }

    /**
     * Test of getEmailAddress method, of class People.
     */
    @Test
    public void testGetEmailAddress() {
       
        People instance = new PeopleImpl();
        String expResult = "waheedrafiq@outlook.com";
        instance.setEmailAddress(expResult);
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        System.out.println("getEmailAddress " + expResult);
    }

    /**
     * Test of setEmailAddress method, of class People.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "waheedrafiq@outlook.com";
        People instance = new PeopleImpl();
        instance.setEmailAddress(emailAddress);
        
        assertEquals(emailAddress,instance.getEmailAddress());
    }

    /**
     * Test of getFacepicture method, of class People.
     */
    @Test
    public void testGetFacepicture() {
        System.out.println("getFacepicture");
        People instance = new PeopleImpl();
        byte[][] expResult = null;
        byte[][] result = instance.getFacepicture();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setFacepicture method, of class People.
     */
    @Test
    public void testSetFacepicture() {
        System.out.println("setFacepicture");
        byte[][] facepicture = null;
        People instance = new PeopleImpl();
        instance.setFacepicture(facepicture);
       
        Assert.assertArrayEquals(facepicture,instance.getFacepicture());
    }

    public class PeopleImpl extends People {

        public void PrintDetails() {
        }

        @Override
        public void addContacts() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
