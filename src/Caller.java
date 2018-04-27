
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class contains example that showcases how to create custom encryption
 * @version 1.0
 * @author Sudipta Saha
 */
public class Caller {
    
    /**
     * This method shows examples on how we can create custom file with custom extention through encryption and then also decrypt it. 
     * @param args 
     */
    public static void main(String[] args) {
 
        String fromFile="test.mp3";  // File name to read from
        String customFile="myFile.cool"; // Custom file name to write to
        String toFile="test2.mp3"; //File name to write after reading from custom file 
        
        //Encryption
        FileEncrypter e=new FileEncrypter();
        try {
            e.encryptFile(fromFile, customFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //Decryption
        FileDecrypter d=new FileDecrypter();
        try {
            d.decryptFile(customFile, toFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
