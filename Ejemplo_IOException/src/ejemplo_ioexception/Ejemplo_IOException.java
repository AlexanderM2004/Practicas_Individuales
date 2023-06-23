package ejemplo_ioexception;
import java.io.*;
public class Ejemplo_IOException {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileInputStream file = new FileInputStream("Ejemplo.txt");
            int x = file.read();
            while (x != -1) {
              System.out.print((char) x);
              x = file.read();
        }
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
