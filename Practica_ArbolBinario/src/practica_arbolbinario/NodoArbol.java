/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_arbolbinario;

/**
 *
 * @author PERSONAL
 */
public class NodoArbol {
    Persona persona;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(Persona persona) {
        this.persona = persona;
        this.izquierdo = null;
        this.derecho = null;
    }
}
