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
public class ListaCircular {

    private Nodo ultimo;

    public ListaCircular() {
        this.ultimo = null;
    }

    public void Ingresar(Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.setEnlace(ultimo.getEnlace());
        } else {
            nuevo.setEnlace(this.ultimo);
            this.ultimo = nuevo;
        }
    }

    public int ContarNodos() {
        if (this.ultimo == null) {
            return 0;
        }
        return 0;
    }
}
