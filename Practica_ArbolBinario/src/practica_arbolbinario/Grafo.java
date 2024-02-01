/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_arbolbinario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author PERSONAL
 */
public class Grafo {
    private Map<Persona, List<Persona>> relaciones;

    public Grafo() {
        this.relaciones = new HashMap<>();
    }

    public void agregarPersona(Persona persona) {
        relaciones.put(persona, new ArrayList<>());
    }

    public void agregarRelacion(Persona persona1, Persona persona2) {
        relaciones.get(persona1).add(persona2);
        relaciones.get(persona2).add(persona1);
    }

    public void mostrar() {
        for (Persona persona : relaciones.keySet()) {
            System.out.print("Nombre: " + persona.nombre + ", Edad: " + persona.edad + " -> Relaciones: ");
            List<Persona> personasRelacionadas = relaciones.get(persona);
            for (Persona relacionada : personasRelacionadas) {
                System.out.print(relacionada.nombre + ", ");
            }
            System.out.println();
        }
    }

    public Persona buscarPersonaPorEdad(int edad) {
        for (Persona persona : relaciones.keySet()) {
            if (persona.edad == edad) {
                return persona;
            }
        }
        return null;
    }
}
