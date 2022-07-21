/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.euclides;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Euclides {

    private int num_A;
    private int num_B;

    public Euclides(int num_A, int num_B) {
        this.num_A = num_A;
        this.num_B = num_B;
    }

    public void setNum_A(int num_A) {
        this.num_A = num_A;
    }

    public void setNum_B(int num_B) {
        this.num_B = num_B;
    }

    public int getNum_A() {
        return num_A;
    }

    public int getNum_B() {
        return num_B;
    }

    public int EUCLIDES_RESPUESTA() {
        int aux_a = this.num_A;
        int aux_b = this.num_B;
         while( aux_a != aux_b ) {
           if( aux_a < aux_b ) {
             aux_b = aux_b - aux_a;
           } else {
             aux_a = aux_a - aux_b;
           }
        }
        return(aux_a);
    }

    public void EUCLIDES_PROCESO(int num_A, int num_B) {
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int EUCLIDES(int num_1, int num_2) {
        int respuesta = num_2;        
         if (num_2 <= num_1) {
             return respuesta;
         } else {
             respuesta = EUCLIDES(num_1, (num_2 % num_1));
             return respuesta;
         }
    }
    
    
    
    
    
    

}
