/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicaddressbook;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author waheedrafiq
 */
public class AddressBookDetails  extends People{
    
    private String category; 
    //public List<BufferedImage> imageList = new ArrayList<BufferedImage>();
    
   
    public AddressBookDetails(String fName,String lastName , String EmailAddress,
     String Category){
        
        super(fName,lastName ,EmailAddress);
            
            this.category= Category;
        
    }
    

    
    
    public void addContacts(String fName,String LastName,String emailAddress,
            String myCategory){
    
     try{
          BufferedImage image = ImageIO.read(new File("C:/java/waheed.jpg"));
          byte[] imageBytes = ((DataBufferByte))image.getData().getDataBuffer());
          
          image.getGraphics().drawLine(1, 1, image.getWidth()-1, image.getHeight()-1);
          image.getGraphics().drawLine(1, image.getHeight()-1, image.getWidth()-1, 1);

          ImageIO.write(image, "png", new File("C:/java/output.png"));
          
          
          People p = new AddressBookDetails("Waheed","Rafiq","wrafiq@gmail.com",
                  "MyFriends");
          
          p.setFname(fName);
          p.setLastname(LastName);
          p.setEmailAddress(emailAddress);
          p.setFacepicture(facepicture);
          
          
          
          
          
     }
     catch (IOException e){
         e.printStackTrace();
     }
    }
        

     

        
    }
    
    @Override 
    public void PrintDetails(){
        // print AddressBook deails 
        
    }
    
    
    
    
    public String  updateContact(String nameUpdate){
        
        return nameUpdate; 
    }
    
    public String removedContact(String nameRemove){
        
        return nameRemove;
    }
    
    public String searchContact(String nameSearch){
        
        return nameSearch;
    }
    
    
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
