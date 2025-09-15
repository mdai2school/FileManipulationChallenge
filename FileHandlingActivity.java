import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {        

        File dir = new File("Maine");
        dir.mkdir();

        // b. Create three text files
        File creditCard = new File("myCreditCard");
        creditCard.createNewFile();
        File SSN = new File("mySSN");
        SSN.createNewFile();
        File passwords = new File("myPasswords");
        passwords.createNewFile();
        
        // c. Write messages to files
        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}