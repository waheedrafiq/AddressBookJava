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
public class ContactListManagedTest {
    
    public ContactListManagedTest() {
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
     * Test of addContacts method, of class ContactListManaged.
     */
    @Test
    public void testAddContacts() {
        System.out.println("addContacts");
        ContactListManaged instance = new ContactListManagedImpl();
        instance.addContacts(); // empy method write to text file. 
       
    }

    public class ContactListManagedImpl implements ContactListManaged {
        @Override
        public void addContacts() {
            System.out.println("File written successfully");
        }
    }
    
}
