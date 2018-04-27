
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

/**
 * This class contains methods to read data from a file.
 * @version 1.0
 * @author Sudipta Saha
 */
class FileReader {
    /**
     * This function reads data from a file called filename
     * @param fileName The name of the file we want to read from.
     * @return The string data stored in the file.
     * @throws FileNotFoundException In case the file doesn't exist or cannot be created.
     * @throws IOException While reading using inputSteam, we can have input output exception.
     */
    public static String getFileInString(String fileName) throws FileNotFoundException, IOException{
        File file = new File(fileName);
        ByteArrayOutputStream bos=null;
        FileInputStream fis = new FileInputStream(file);
        bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum); 
                  
        }
        byte[] bytes = bos.toByteArray();
        Base64.Encoder e = Base64.getEncoder();
        bos.flush();
        if(bos!=null)
            bos.close();
        return e.encodeToString(bytes);
    }
}
