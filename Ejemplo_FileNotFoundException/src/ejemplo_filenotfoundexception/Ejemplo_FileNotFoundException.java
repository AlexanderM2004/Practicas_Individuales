package ejemplo_filenotfoundexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo_FileNotFoundException {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File myObj = new File("Ejemplo1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
        }
        myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
            e.printStackTrace();
        }
    }
    
}
