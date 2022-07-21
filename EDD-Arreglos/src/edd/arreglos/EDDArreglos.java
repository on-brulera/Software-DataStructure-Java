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
public class EDDArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglo arregloOperaciones = new Arreglo();
        int[] arregloInt = {5, 2, 7, 1, 8, 9, 0, 3, 4, 6};
        String[] arregloString = {"aaa", "zzz", "cuaderno", "cuadra", "cuadrado", "cuatro", "cuaa"};

        arregloOperaciones.imprimir(arregloInt);
        System.out.println("METODO SUMA");
        System.out.println("Resultado: " + arregloOperaciones.suma(arregloInt));

        System.out.println("PROMEDIO");
        System.out.println("Resultado: " + arregloOperaciones.promedio(arregloInt));

        System.out.println("NÚMERO MAYOR");
        System.out.println("Mayor: " + arregloOperaciones.mayor(arregloInt));

        System.out.println("NÚMERO MENOR");
        System.out.println("Menor: " + arregloOperaciones.menor(arregloInt));

        System.out.println("ORDENAR ASCENDENTEMENTE INT");
        arregloOperaciones.imprimir(arregloInt);
        arregloOperaciones.ordenarIntAscendente(arregloInt);
        arregloOperaciones.imprimir(arregloInt);

        System.out.println("ORDENAR DESCENDENTEMENTE INT");
        arregloOperaciones.imprimir(arregloInt);
        arregloOperaciones.ordenarIntDescendente(arregloInt);
        arregloOperaciones.imprimir(arregloInt);

        System.out.println("ORDENAR ASCENDENTEMENTE STRING");
        arregloOperaciones.imprimir(arregloString);
        arregloOperaciones.ordenarStringAscendete(arregloString);
        arregloOperaciones.imprimir(arregloString);

        System.out.println("ORDENAR DESCENDENTEMENTE STRING");
        arregloOperaciones.imprimir(arregloString);
        arregloOperaciones.ordenarStringDescendente(arregloString);
        arregloOperaciones.imprimir(arregloString);
    }

}
