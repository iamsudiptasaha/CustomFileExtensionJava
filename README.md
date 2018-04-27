# customFileExtensionJava
This program contains functionalities that showcase how to create a custom file with custom extension. The custom file can have encrypted data as well. Further it also contains functionalities to decrypt and get back the original file.


```
// File name to read from
  String fromFile="test.mp3";  

// Custom file name to write to
  String customFile="myFile.cool"; 


//File name to write after reading from custom file 
  String toFile="test2.mp3"; 


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
```      
        
