/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Cola {

    private Object[] cola;
    private int tamaño;
    private int numElementos;
    private int inicio;
    private int fin;

    public Cola(int tamaño) {
        this.tamaño = tamaño;
        this.cola = new Object[tamaño];
        this.numElementos = 0;
        this.inicio = 0;
        this.fin = 0;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public boolean lleno() {
        if (this.numElementos == this.tamaño) {
            return true;
        }
        return false;
    }

    public boolean vacio() {
        if (this.numElementos == 0) {
            return true;
        }
        return false;
    }

    public void ingresar(Object dato) {
        if (!lleno()) {
            this.cola[fin++] = dato;
            this.numElementos++;
            if (this.fin == tamaño) {
                this.fin = 0;
            }
        }
    }

    public Object retirar() {
        Object aux = null;
        if (!vacio()) {
            aux = this.cola[inicio++];
            this.numElementos--;
            if (this.inicio == this.tamaño) {
                this.inicio = 0;
            }
        }
        return aux;
    }

    public Object primerElemento() {
        Object aux = null;
        if (!vacio()) {
            return cola[inicio];
        }
        return aux;
    }

}
