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
public class mainn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular circular = new ListaCircular();
        circular.Ingresar(12);
        circular.Ingresar(1);
        circular.Ingresar(12);
        circular.Ingresar(1);
        circular.Ingresar(1);
        circular.Ingresar(1);
        System.out.println("nodos: " + circular.ContarNodos());
    }

}
