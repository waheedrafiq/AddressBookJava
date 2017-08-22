/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicaddressbook;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author waheedrafiq
 */
public class AddressBookDetailsTest {
    
    public AddressBookDetailsTest() {
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
     * Test of PrintDetails method, of class AddressBookDetails.
     */
    @Test
    public void testPrintDetails() {
        System.out.println("PrintDetails");
        AddressBookDetails instance = new AddressBookDetails();
        instance.PrintDetails(); // empty call 
        
       
     
    }

    /**
     * Test of addContacts method, of class AddressBookDetails.
     */
    @Test
    public void testAddContacts() {
        System.out.println("addContacts");
        AddressBookDetails instance = new AddressBookDetails();
        instance.addContacts(); // emtpy method writes to text file.
         
    }

    /**
     * Test of updateContact method, of class AddressBookDetails.
     */
    @Test
    public void testUpdateContact() {
        System.out.println("updateContact");
        String nameUpdate = "Rafiq";
        AddressBookDetails instance = new AddressBookDetails();
        instance.updateContact(nameUpdate);
     
        assertEquals(nameUpdate,instance.updateContact(nameUpdate));
    }

    /**
     * Test of removedContact method, of class AddressBookDetails.
     */
    @Test
    public void testRemovedContact() {
        System.out.println("removedContact");
        String nameRemove = "test1";
        AddressBookDetails instance = new AddressBookDetails();
 
     
        assertEquals(nameRemove,instance.removedContact("test1"));
        
        
      
    }

    /**
     * Test of searchContact method, of class AddressBookDetails.
     */
    @Test
    public void testSearchContact() {
        System.out.println("searchContact");
        String nameSearch = "Waheed";
        AddressBookDetails instance = new AddressBookDetails();
        String expResult = "Waheed";
        String result = instance.searchContact(nameSearch);
        assertEquals(expResult, result);
     
        
        
    }

    /**
     * Test of getCategory method, of class AddressBookDetails.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        AddressBookDetails instance = new AddressBookDetails();
        String expResult ="MyFriends" ;
        instance.setCategory(expResult);
        String result = instance.getCategory();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setCategory method, of class AddressBookDetails.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "Myfriends";
        AddressBookDetails instance = new AddressBookDetails();
        // applying the technique approach of side effect 
        
        instance.setCategory(category);
        assertEquals("Myfriends", instance.getCategory());
        
      
    }
    
}
