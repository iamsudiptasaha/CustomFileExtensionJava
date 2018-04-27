
import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * This class contains functionalities to decrypt a string.
 * @version 1.0
 * @author Sudipta Saha
 */
class DefaultDecrypter {
    /**
     * This is a custom string decrypt function. This function can be modified to get custom decryption standards. 
     * @param cipherText The encrypted string.
     * @return The plain string.
     */
    protected static String decrypt(String cipherText){
         String data="";
        try { 
            byte[] temp = cipherText.getBytes();
            
            Base64.Decoder d=Base64.getDecoder();
            byte[] decarray = d.decode(temp);
            data= new String(decarray,"UTF-8"); 
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        finally{
            return data;
        }
        
       
    }
}
