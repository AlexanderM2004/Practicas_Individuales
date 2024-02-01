/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_arbolbinario;

/**
 *
 * @author PERSONAL
 */
public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(Persona persona) {
        raiz = insertarRec(raiz, persona);
    }

    private NodoArbol insertarRec(NodoArbol nodo, Persona persona) {
        if (nodo == null) {
            return new NodoArbol(persona);
        }

        if (persona.edad < nodo.persona.edad) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, persona);
        } else if (persona.edad > nodo.persona.edad) {
            nodo.derecho = insertarRec(nodo.derecho, persona);
        }

        return nodo;
    }

    public void mostrar() {
        mostrarRec(raiz);
    }

    private void mostrarRec(NodoArbol nodo) {
        if (nodo != null) {
            mostrarRec(nodo.izquierdo);
            System.out.println("Nombre: " + nodo.persona.nombre + ", Edad: " + nodo.persona.edad);
            mostrarRec(nodo.derecho);
        }
    }

    public Persona buscar(int edad) {
        return buscarRec(raiz, edad);
    }

    private Persona buscarRec(NodoArbol nodo, int edad) {
        if (nodo == null || nodo.persona.edad == edad) {
            return (nodo != null) ? nodo.persona : null;
        }

        if (edad < nodo.persona.edad) {
            return buscarRec(nodo.izquierdo, edad);
        } else {
            return buscarRec(nodo.derecho, edad);
        }
    }
}
