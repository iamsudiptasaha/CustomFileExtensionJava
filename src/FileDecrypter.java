
import java.io.IOException;
/**
 * This class contains functionalities to read a file, decrypt the data and store it into another file.
 * @version 1.0
 * @author Sudipta Saha
 */
class FileDecrypter extends DefaultDecrypter{
    /**
     * This method decrypts data from a given file called fromFileName and stores it in toFileName.
     * @param fromFileName The name of the file from which we want to read the data.
     * @param toFileName The name of the file in which we want to save the data.
     * @throws IOException While reading and writing we can have input output exception.
     */
    public void decryptFile(String fromFileName, String toFileName) throws IOException{
        String data=decrypt(FileReader.getFileInString(fromFileName));
        FileWriter.saveFileFromString(toFileName, data);
    }
}
