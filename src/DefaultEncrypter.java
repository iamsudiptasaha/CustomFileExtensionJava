
import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * This class contains functionalities to encrypt a string.
 * @version 1.0
 * @author Sudipta Saha
 */
class DefaultEncrypter{
    /**
     * This is a custom string encrypt function. This function can be modified to get custom encryption standards. 
     * @param data The plain text.
     * @return The encrypted text.
     */
    protected static String encrypt(String data){
        String cipherText="";
        Base64.Encoder e = Base64.getEncoder();
        byte[] encryptArray = e.encode(data.getBytes());
        try {   
            cipherText = new String(encryptArray,"UTF-8");
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        finally{
            return cipherText;
        }
        
    }
}
