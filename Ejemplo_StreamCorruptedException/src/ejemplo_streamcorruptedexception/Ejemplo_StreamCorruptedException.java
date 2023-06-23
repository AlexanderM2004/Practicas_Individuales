package ejemplo_streamcorruptedexception;
import java.io.*;
public class Ejemplo_StreamCorruptedException {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileInputStream file = new FileInputStream("Ejemplo.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            Object obj = in.readObject();
            in.close();
            file.close();
        } catch (StreamCorruptedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }  
}
