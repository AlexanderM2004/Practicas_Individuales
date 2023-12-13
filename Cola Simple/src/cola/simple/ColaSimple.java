
package cola.simple;

import java.util.LinkedList;
import java.util.Queue;

public class ColaSimple {
    public static void eliminarElementoMedio(Queue<Integer> cola, int elemento) {
        Queue<Integer> colaAux = new LinkedList<>();
        int size = cola.size();
        int contador = 0;

        while (!cola.isEmpty()) {
            int valor = cola.poll();
            if (valor == elemento) {
                // Elemento encontrado, no lo agregamos a la cola auxiliar
                break;
            }
            colaAux.add(valor);
            contador++;
        }

        // Agregamos los elementos restantes de la cola original a la cola auxiliar
        while (!cola.isEmpty()) {
            colaAux.add(cola.poll());
        }

        // Si el elemento a eliminar estaba en el medio, actualizamos la cola original
        if (contador < size - 1) {
            cola.clear();
            cola.addAll(colaAux);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        cola.add(50);

        int elementoAEliminar = 30;
        eliminarElementoMedio(cola, elementoAEliminar);

        System.out.println("Cola después de eliminar el elemento " + elementoAEliminar + ": " + cola);
    }
}
