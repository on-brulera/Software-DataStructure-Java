/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.ejercicios;

/**
 *
 * @author Usuario
 */
public class Arreglo {

    public int suma(int[] lista) {
        int Resultado = 0;
        for (int x = 0; x < lista.length; x++) {
            Resultado += lista[x];
        }
        return Resultado;
    }

    public double promedio(int lista[]) {
        double Promedio = suma(lista) / lista.length;
        return Promedio;
    }

    public double menor(int lista[]) {
        int menor = lista[0];
        for (int x = 1; x < lista.length; x++) {
            if (lista[x] < menor) {
                menor = lista[x];
            }
        }
        return menor;
    }

    public double mayor(int lista[]) {
        int mayor = lista[0];
        for (int x = 1; x < lista.length; x++) {
            if (lista[x] < mayor) {
                mayor = lista[x];
            }
        }
        return mayor;
    }

    public void ordenarIntAscendente(int[] lista) {
        int auxiliar;
        for (int i = 0; i < lista.length; i++) {
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    auxiliar = lista[i];
                    lista[i] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }
    }

    public void ordenarStringAscendete(String[] lista) {
        String auxiliar;
        for (int i = 0; i < lista.length; i++) {
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[i].compareTo(lista[j]) > 0) {
                    auxiliar = lista[i];
                    lista[i] = lista[j];
                    lista[j] = auxiliar;
                }
            }
        }
    }
    
    public void ordenarStringDescendente(String[] lista) {
        String auxiliar;
        for (int i = 0; i < lista.length; i++) {
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[i].compareTo(lista[j]) < 0) {
                    auxiliar = lista[j];
                    lista[j] = lista[i];
                    lista[i] = auxiliar;
                }
            }
        }
    }

    public void IMPRIMIR(int[] lista) {
        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + "  ");
        }
        System.out.println("");
    }
    public void IMPRIMIR(String[] lista) {
        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + "  ");
        }
        System.out.println("");
    }
}
