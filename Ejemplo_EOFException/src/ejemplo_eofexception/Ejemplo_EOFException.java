package ejemplo_eofexception;
import java.io.*;
public class Ejemplo_EOFException {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        DataInputStream dis = new DataInputStream(new FileInputStream("Ejemplo.txt"));
            while (true) {
             System.out.println(dis.readUTF());
            }
        } catch (EOFException e) {
            System.out.println("Fin del Archivo");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
