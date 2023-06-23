package ejemplo_notserializableexception;
import java.io.*;
public class Ejemplo_NotSerializableException {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileOutputStream file = new FileOutputStream("Ejemplo.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(new Object());
            out.close();
            file.close();
        } catch (NotSerializableException e) {
             System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
        }
    }
}
