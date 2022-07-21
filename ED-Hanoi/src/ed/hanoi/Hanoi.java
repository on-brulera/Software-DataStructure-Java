/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ed.hanoi;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Hanoi {
          
    
    public  String HANOI(String origen, String aux, String destino, int num_discos) {
        String respuesta = "";
        if(num_discos ==1){
            respuesta += "mover disco: " + num_discos + " de " + origen  + " ----> " + destino + "\n"; 
        } else {
            respuesta += HANOI(origen, destino, aux, num_discos -1);
            respuesta += "mover disco: " + num_discos + " de " + origen + " ----> " + destino + "\n";
            respuesta += HANOI(aux, origen, destino, num_discos -1);
        }
        
        return respuesta;
    }
}
