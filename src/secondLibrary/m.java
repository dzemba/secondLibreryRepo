package secondLibrary;

public class m {

	 public static void main(String[] args) throws Exception {
	     	
		 	String datafile = "test.TXT";
	        String FileName = "encryptedtext.txt";
	        String FileName2 = "decryptedtext.txt";
	        System.out.println("test1");
	        Crypt.szyfrowanie(FileName, FileName2);
	        System.out.println("test2");
	        ControllSum.CheckSum(datafile);
	   

	        return;
	    }
   
}