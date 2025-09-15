import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {        

        File dir = new File("Maine");
        dir.mkdir();

        File creditCard = new File("myCreditCard");
        creditCard.createNewFile();
        File SSN = new File("mySSN");
        SSN.createNewFile();
        File passwords = new File("myPasswords");
        passwords.createNewFile();

        // c. Write messages to files
        FileWriter pencil = new FileWriter(creditCard);
        pencil.write("My credit card number is 15!");
        pencil.close();
        FileWriter pen = new FileWriter(SSN);
        pen.write("My SSN is 21!");
        pen.close();
        FileWriter sharpie = new FileWriter(passwords);
        sharpie.write("My password is 1234!");
        sharpie.close();
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}