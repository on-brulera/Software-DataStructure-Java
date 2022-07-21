/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Usuario
 */
public class ListaLineal {

    private Nodo inicio;

    public ListaLineal() {
        this.inicio = null;
    }

    public String ingresarInicio(Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            nuevo.setEnlace(inicio);
            this.inicio = nuevo;
        }
        return "primer dato ingresado correctamente";
    }

    public String ingresarFinal(Object informacion) {
        Nodo fin = new Nodo(informacion);
        if (inicio == null) {
            this.inicio = fin;
        } else {
            Nodo aux = inicio;
            while (aux.getEnlace() != null) {
                aux = aux.getEnlace();
            }
            aux.setEnlace(fin);
        }
        return "ultimo dato ingresado correctamente";
    }

    public String ingresarPrueba(Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        Nodo auxNodo;
        double precioNuevo, precioLista;

        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            auxNodo = inicio;
            precioLista = ((Producto) auxNodo.getInformacion()).getPrecio();
            precioNuevo = ((Producto) nuevo.getInformacion()).getPrecio();

            if (precioNuevo > precioLista) {
                nuevo.setEnlace(inicio);
                this.inicio = nuevo;
            } else {
                precioLista = ((Producto) auxNodo.getEnlace().getInformacion()).getPrecio();
                for (int i = 0; i < numeroNodos(); i++) {
                    if (auxNodo.getEnlace() == null) {
                        break;
                    }
                    if (precioNuevo > precioLista) {
                        break;
                    }
                    if (precioNuevo < precioLista) {
                        auxNodo = auxNodo.getEnlace();
                        precioLista = ((Producto) auxNodo.getEnlace().getInformacion()).getPrecio();
                    }
                }
                if (auxNodo.getEnlace() == null) {
                    auxNodo.setEnlace(nuevo);
                } else {
                    nuevo.setEnlace(auxNodo.getEnlace());
                    auxNodo.setEnlace(nuevo);
                }
            }
        }

        return "Elemento ingresado Correctamente y en orden, too crack el método";
    }

    //retornar el numero de nodos
    public int numeroNodos() {
        int contador = 0;
        if (this.inicio != null) {
            Nodo aux = inicio;
            contador++;
            while (aux.getEnlace() != null) {
                contador++;
                aux = aux.getEnlace();
            }
        }
        return contador;
    }

    // debe retornar el primer elemento de la lista pero tambien debe eliminarlo
    public Nodo retirarPrimero() {
        Nodo aux = this.inicio;
        if (numeroNodos() > 1) {
            this.inicio = this.inicio.getEnlace();
        } else {
            this.inicio = null;
        }
        return aux;
    }

    //retornar el ultimo nodo de la lista y eliminarlo
    public Nodo retirarUltimo() {
        Nodo aux = this.inicio;
        if (numeroNodos() > 1) {
            for (int i = 1; i <= (numeroNodos() - 2); i++) {
                aux = aux.getEnlace();
            }
            aux.setEnlace(null);
        } else {
            this.inicio = null;
        }
        return aux;
    }

    public Nodo verInicio() {
        return inicio;
    }

    public Nodo verUltimo() {
        Nodo aux = inicio;
        while (aux.getEnlace() != null) {
            aux = aux.getEnlace();
        }
        return aux;
    }
}
