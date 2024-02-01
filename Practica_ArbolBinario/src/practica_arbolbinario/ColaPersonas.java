/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_arbolbinario;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author PERSONAL
 */
public class ColaPersonas {
    private Queue<Persona> cola;

    public ColaPersonas() {
        this.cola = new LinkedList<>();
    }

    public void encolar(Persona persona) {
        Queue<Persona> auxiliar = new LinkedList<>();

        // Desencola elementos mayores a la nueva persona
        while (!cola.isEmpty() && cola.peek().edad > persona.edad) {
            auxiliar.offer(cola.poll());
        }

        // Encola la nueva persona
        cola.offer(persona);

        // Reencola los elementos mayores
        while (!auxiliar.isEmpty()) {
            cola.offer(auxiliar.poll());
        }
    }

    public void mostrar() {
        System.out.println("Personas ordenadas por edad:");
        for (Persona persona : cola) {
            System.out.println("Nombre: " + persona.nombre + ", Edad: " + persona.edad);
        }
    }

    public Persona buscar(int edad) {
        for (Persona persona : cola) {
            if (persona.edad == edad) {
                return persona;
            }
        }
        return null;
    }
}
