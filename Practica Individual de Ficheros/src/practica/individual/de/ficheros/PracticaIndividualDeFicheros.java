/*
 * Practica de Ficheros
 */
package practica.individual.de.ficheros;

/**
 * @author Alexander Quizhpe
 */

import java.io.*;
import java.util.Scanner;

public class PracticaIndividualDeFicheros {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String casa = "alexander";
        String caa = "alexander";
        //Crea y escribe el fichero 
        try{
            FileWriter br = new FileWriter( "C:\\Users\\PERSONAL\\Documents\\NetBeansProjects\\Fichero.txt");
            br.write("Practica de Ficheros V 0.1.1");
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
        //Permite sobreescribir el fichero
        try (PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\PERSONAL\\Documents\\NetBeansProjects\\Fichero.txt", true))) {
            out.println(""+casa);
            out.println(caa);
            System.out.println("Texto agregado al archivo exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Permite leer datos del fichero
        try {
            File archivo = new File("C:\\Users\\PERSONAL\\Documents\\NetBeansProjects\\Fichero.txt");

            // Creamos un Scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea); // Imprimimos cada línea
            }

            scanner.close(); // Cerramos el flujo
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
