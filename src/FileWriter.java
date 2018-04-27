
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;


/**
 * This class contains methods to write data to a file.
 * @version 1.0
 * @author Sudipta Saha
 */
class FileWriter {
    /**
     * This function takes data and writes to file called filename
     * @param fileName The name of the file we want to write to.
     * @param data The data that shall be written.
     * @throws FileNotFoundException In case the file doesn't exist or cannot be created.
     * @throws IOException While writing using outputSteam, we can have input output exception.
     */
    public static void saveFileFromString(String fileName, String data) throws FileNotFoundException, IOException{
        Base64.Decoder d=Base64.getDecoder();
        byte[] bytes=d.decode(data);
        File file = new File(fileName);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.flush();
        if(fos!=null)
            fos.close();
       
    }
}
