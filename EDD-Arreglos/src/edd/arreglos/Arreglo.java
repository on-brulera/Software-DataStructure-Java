/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.arreglos;

/**
 *
 * @author Usuario
 */
public class Arreglo {

    /**
     * El método suma todos los elementos de un arreglo
     *
     * @param lista es la arreglo de enteros
     * @return regresa un int con el resultado de la suma
     */
    public int suma(int[] lista) {
        int Resultado = 0;
        for (int x = 0; x < lista.length; x++) {
            Resultado += lista[x];
        }
        return Resultado;
    }

    /**
     * El método calcula el promedio de un arreglo
     *
     * @param lista es el arreglo de enteros
     * @return regresa un double con el promedio
     */
    public double promedio(int lista[]) {
        return (double) suma(lista) / lista.length;
    }

    /**
     * El método determina el menor número de un arreglo
     *
     * @param lista es el arreglo de enteros
     * @return regresa un int con el menor número
     */
    public int menor(int lista[]) {
        int menor = lista[0];
        for (int x = 1; x < lista.length; x++) {
            if (lista[x] < menor) {
                menor = lista[x];
            }
        }
        return menor;
    }

    /**
     * El método determina el menor número de un arreglo
     *
     * @param lista es el arreglo de enteros
     * @return regresa un int con el mayor número
     */
    public int mayor(int lista[]) {
        int mayor = lista[0];
        for (int x = 1; x < lista.length; x++) {
            if (lista[x] > mayor) {
                mayor = lista[x];
            }
        }
        return mayor;
    }

    /**
     * El método ordena de menor a mayor los números de un arreglo
     *
     * @param lista es el arreglo de enteros
     */
    public void ordenarIntAscendente(int[] lista) {
        int auxiliar;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    auxiliar = lista[i];
                    lista[i] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }
    }

    /**
     * El método ordena de mayor a menor los números de un arreglo
     *
     * @param lista es el arreglo de enteros
     */
    public void ordenarIntDescendente(int[] lista) {
        int auxiliar;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[i] < lista[j]) {
                    auxiliar = lista[i];
                    lista[i] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }
    }

    /**
     * El método ordena de menor a mayor los String de un arreglo
     *
     * @param lista es el arreglo de String
     */
    public void ordenarStringAscendete(String[] lista) {
        String auxiliar;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[i].compareTo(lista[j]) > 0) {
                    auxiliar = lista[i];
                    lista[i] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }
    }

    /**
     * El método ordena de mayor a menor los String de un arreglo
     *
     * @param lista es el arreglo de String
     */
    public void ordenarStringDescendente(String[] lista) {
        String auxiliar;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[i].compareTo(lista[j]) < 0) {
                    auxiliar = lista[j];
                    lista[j] = lista[i];
                    lista[i] = auxiliar;
                }
            }
        }
    }

    /**
     * El método imprime por consolas un arreglo de enteros
     *
     * @param lista es el arreglo de enteros
     */
    public void imprimir(int[] lista) {
        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + "  ");
        }
        System.out.println("");
    }

    /**
     * El método imprime por consola un arreglo de String
     *
     * @param lista es el arreglo de String
     */
    public void imprimir(String[] lista) {
        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + "  ");
        }
        System.out.println("");
    }
}
