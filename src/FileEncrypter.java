
import java.io.IOException;

/**
 * This class contains functionalities to read a file, encrypt the data and store it into another file.
 * @version 1.0
 * @author Sudipta Saha
 */
class FileEncrypter extends DefaultEncrypter{
    /**
     * This method encrypts data from a given file called fromFileName and stores it in toFileName.
     * @param fromFileName The name of the file from which we want to read the data.
     * @param toFileName The name of the file in which we want to save the data.
     * @throws IOException While reading and writing we can have input output exception.
     */
    public void encryptFile(String fromFileName, String toFileName) throws IOException{
        String data=encrypt(FileReader.getFileInString(fromFileName));
        FileWriter.saveFileFromString(toFileName, data);
    }
}
