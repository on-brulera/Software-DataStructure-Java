/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.ejercicios;

/**
 * @author Henry
 */
public class Pila {

    private int tamaño;
    private int num_elementos;
    private Object pila[];

    /**
     * El constructor de la pila tipo Object
     *
     * @param tamaño debe ser positivo y mayor a cero. Es el tamaño de la pila
     */
    public Pila(int tamaño) {
        if (tamaño > 0) {
            this.tamaño = tamaño;
            this.pila = new Object[tamaño];
        } else {
            this.pila = new Object[10];
            this.tamaño = 10;
        }
        this.num_elementos = 0;

    }

    public boolean vacio() {
        if (this.num_elementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lleno() {
        if (this.num_elementos == this.tamaño) {
            return true;
        } else {
            return false;
        }
    }

    public void añadir(Object dato) {
        if (!this.lleno()) {
            this.pila[this.num_elementos] = dato;
            this.num_elementos++;
        }
    }

    public void quitar(Object dato) {
        if (!this.vacio()) {
            this.pila[this.num_elementos] = null;
            this.num_elementos--;
        }
    }
    
    
}
