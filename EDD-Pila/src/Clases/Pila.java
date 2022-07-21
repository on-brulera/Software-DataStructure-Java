/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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

    /**
     * El método revisa si el arreglo esta vació
     *
     * @return regresa true si esta completamente vacía, caso contrario false
     */
    public boolean vacio() {
        if (this.num_elementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * El método revisa si el arreglo esta lleno
     *
     * @return regresa true si esta completamente lleno, caso contrario false
     */
    public boolean lleno() {
        if (this.num_elementos == this.tamaño) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * El método añade datos al arreglo, si el arreglo esta lleno no añade
     *
     * @param dato es una variable tipo objeto
     */
    public String apilar(Object dato) {
        try {
            if (!this.lleno()) {
                this.pila[this.num_elementos] = dato;
                this.num_elementos++;
            }
            return "dato apilado correctamente";
        } catch (Exception e) {
            return "no se pudo apilar el dato";
        }
    }

    /** 
     * El método quita datos al arreglo, desde la última posición si el arreglo
     * esta vacío no quita
     */
    public String desapilar() {
        if (!this.vacio()) {
            this.pila[this.num_elementos - 1] = null;
            this.num_elementos--;
            return "dato desapilado correctamente";
        }
        return "No se pudo desapilar el dato";
    }
    
    public Object Desapilar() {
        if (!this.vacio()) {
            Object aux = this.pila[this.num_elementos - 1];
            this.pila[this.num_elementos - 1] = null;
            this.num_elementos--;
            return aux;
        }
        return null;
    }

    public void imprimir() {
        System.out.print("Pila: [ ");
        for (int x = 0; x < this.pila.length; x++) {
            System.out.print(this.pila[x] + " ");
        }
        System.out.print("]");
    }

    /**
     * El método determina la cima, último elemento ingresado a la pila
     *
     * @return un dato tipo Object, si el arreglo esta vacío retorna null
     */
    public Object cima() {
        if (!this.vacio()) {
            return this.pila[this.num_elementos - 1];
        } else {
            return null;
        }
    }

    public int getNúmeroElementos() {
        return this.num_elementos;
    }
    
    public int getTamaño(){
        return this.tamaño; 
    }
}
