/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_arbolbinario;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Practica_ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1: Arbol Binario");
            System.out.println("2: Grafos");
            System.out.println("3: Pilas");
            System.out.println("4: Colas");
            System.out.println("5: Salir");
            
            opc = tec.nextInt();
            switch(opc){
                case 1:
                    ArbolBinario arbol = new ArbolBinario();

                    arbol.insertar(new Persona("Juan", 25));
                    arbol.insertar(new Persona("Ana", 30));
                    arbol.insertar(new Persona("Carlos", 20));
                    arbol.insertar(new Persona("Maria", 35));

                    System.out.println("Personas ordenadas por edad:");
                    arbol.mostrar();

                    int edadBuscada = 30;
                    Persona personaBuscada = arbol.buscar(edadBuscada);

                    if (personaBuscada != null) {
                        System.out.println("\nPersona encontrada - Nombre: " + personaBuscada.nombre + ", Edad: " + personaBuscada.edad);
                    } else {
                        System.out.println("\nPersona no encontrada con edad " + edadBuscada);
                    }
                    break;
                case 2:
                    Grafo grafo = new Grafo();

                    Persona persona1 = new Persona("Juan", 25);
                    Persona persona2 = new Persona("Ana", 30);
                    Persona persona3 = new Persona("Carlos", 20);
                    Persona persona4 = new Persona("Maria", 35);

                    grafo.agregarPersona(persona1);
                    grafo.agregarPersona(persona2);
                    grafo.agregarPersona(persona3);
                    grafo.agregarPersona(persona4);

                    grafo.agregarRelacion(persona1, persona2);
                    grafo.agregarRelacion(persona2, persona3);
                    grafo.agregarRelacion(persona3, persona4);

                    System.out.println("Grafo de personas ordenadas por edad:");
                    grafo.mostrar();

                    int edadBuscad = 30;
                    Persona personaBuscad = grafo.buscarPersonaPorEdad(edadBuscad);

                    if (personaBuscad != null) {
                        System.out.println("\nPersona encontrada - Nombre: " + personaBuscad.nombre + ", Edad: " + personaBuscad.edad);
                    } else {
                        System.out.println("\nPersona no encontrada con edad " + edadBuscad);
                    }
                    break;
                case 3:
                    PilaPersonas pilaPersonas = new PilaPersonas();

                    pilaPersonas.apilar(new Persona("Juan", 25));
                    pilaPersonas.apilar(new Persona("Ana", 30));
                    pilaPersonas.apilar(new Persona("Carlos", 20));
                    pilaPersonas.apilar(new Persona("Maria", 35));

                    pilaPersonas.mostrar();

                    edadBuscada = 30;
                    personaBuscada = pilaPersonas.buscar(edadBuscada);

                    if (personaBuscada != null) {
                        System.out.println("\nPersona encontrada - Nombre: " + personaBuscada.nombre + ", Edad: " + personaBuscada.edad);
                    } else {
                        System.out.println("\nPersona no encontrada con edad " + edadBuscada);
                    }
                    break;
                case 4:
                    ColaPersonas colaPersonas = new ColaPersonas();

                    colaPersonas.encolar(new Persona("Juan", 25));
                    colaPersonas.encolar(new Persona("Ana", 30));
                    colaPersonas.encolar(new Persona("Carlos", 20));
                    colaPersonas.encolar(new Persona("Maria", 35));

                    colaPersonas.mostrar();

                    edadBuscada = 30;
                    personaBuscada = colaPersonas.buscar(edadBuscada);

                    if (personaBuscada != null) {
                        System.out.println("\nPersona encontrada - Nombre: " + personaBuscada.nombre + ", Edad: " + personaBuscada.edad);
                    } else {
                        System.out.println("\nPersona no encontrada con edad " + edadBuscada);
                    }
                    break;
                case 5:
                    System.out.println("Espere y terminar esto pronto");
                    break;
                default:
                    System.out.println("Repite pues no seas pendejo");
                    break;
            }
        }while(opc != 5);
    }
    
}
