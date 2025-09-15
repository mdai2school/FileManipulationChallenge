import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {        

        File dir = new File("Maine");
        dir.mkdir();

        File creditCard = new File(dir,"myCreditCard");
        creditCard.createNewFile();
        File SSN = new File(dir,"mySSN");
        SSN.createNewFile();
        File passwords = new File(dir,"myPasswords");
        passwords.createNewFile();

        FileWriter pencil = new FileWriter(creditCard);
        pencil.write("My credit card number is 15!");
        pencil.close();
        FileWriter pen = new FileWriter(SSN);
        pen.write("My SSN is 21!");
        pen.close();
        FileWriter sharpie = new FileWriter(passwords);
        sharpie.write("My password is 1234!");
        sharpie.close();
        
        String stolenCreditCard = "";
        FileReader readingGlasses = new FileReader(creditCard);
        while (readingGlasses.ready()){
            stolenCreditCard += (char)readingGlasses.read();
        }
        System.out.println(stolenCreditCard);
        readingGlasses.close();
        
        String stolenSSN = "";
        FileReader readingGoggles = new FileReader(SSN);
        while (readingGoggles.ready()){
            stolenSSN += (char)readingGoggles.read();
        }
        System.out.println(stolenSSN);
        readingGoggles.close();

        String stolenPasswords = "";
        FileReader readingSnorkel = new FileReader(passwords);
        while (readingSnorkel.ready()){
            stolenPasswords += (char)readingSnorkel.read();
        }
        System.out.println(stolenPasswords);
        readingSnorkel.close();
        
        File backupDir = new File("Pencilvania");
        backupDir.mkdir();
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}