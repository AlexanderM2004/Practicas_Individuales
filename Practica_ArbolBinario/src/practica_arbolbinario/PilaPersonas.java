/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_arbolbinario;

import java.util.Stack;

/**
 *
 * @author PERSONAL
 */
public class PilaPersonas {
    private Stack<Persona> pila;

    public PilaPersonas() {
        this.pila = new Stack<>();
    }

    public void apilar(Persona persona) {
        Stack<Persona> auxiliar = new Stack<>();

        // Desapila elementos mayores a la nueva persona
        while (!pila.isEmpty() && pila.peek().edad > persona.edad) {
            auxiliar.push(pila.pop());
        }

        // Apila la nueva persona
        pila.push(persona);

        // Reapila los elementos mayores
        while (!auxiliar.isEmpty()) {
            pila.push(auxiliar.pop());
        }
    }

    public void mostrar() {
        System.out.println("Personas ordenadas por edad:");
        for (Persona persona : pila) {
            System.out.println("Nombre: " + persona.nombre + ", Edad: " + persona.edad);
        }
    }

    public Persona buscar(int edad) {
        for (Persona persona : pila) {
            if (persona.edad == edad) {
                return persona;
            }
        }
        return null;
    }
}
