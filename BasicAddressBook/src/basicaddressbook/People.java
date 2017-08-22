/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicaddressbook;

import java.util.ArrayList;



/**
 *
 * @author waheedrafiq
 */
public abstract class People  implements ContactListManaged{
    
    private String fname,lastname,emailAddress;
    public byte[] facepicture[];
    private final ArrayList myAddressBookList = new ArrayList(); 
    
    public abstract void  PrintDetails();
    
    
    // define constructor 
    
    public People(String fName,String lastName , String EmailAddress){
        
        this.fname =fName;
        this.lastname = lastName;
        this.emailAddress = EmailAddress;
        
        
    }
    
    
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public byte[][] getFacepicture() {
        return facepicture;
    }

    public void setFacepicture(byte[][] facepicture) {
        this.facepicture = facepicture;
    }
    
}
