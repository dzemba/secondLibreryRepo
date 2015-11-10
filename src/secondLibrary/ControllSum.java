package secondLibrary;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

import java.io.FileInputStream;
import java.security.MessageDigest;

public class ControllSum {
	
  public static void CheckSum(String FileName) throws Exception {
   
    String datafile = "test.txt"; 

    MessageDigest md = MessageDigest.getInstance("SHA1");
    FileInputStream fis = new FileInputStream(datafile);
    byte[] dataBytes = new byte[1024];
    
    int nread = 0; 
    
    while ((nread = fis.read(dataBytes)) != -1) {
      md.update(dataBytes, 0, nread);
    };

    byte[] mdbytes = md.digest();
   
    //convert the byte to hex format
    StringBuffer sb = new StringBuffer("");
    for (int i = 0; i < mdbytes.length; i++) {
    	sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
    }
    
    System.out.println("Digest(in hex format):: " + sb.toString());
    
  }
}