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
public class Nodo {

    private Object informacion;
    private Nodo enlace;    
    
    public Nodo( Object informacion){
        this.informacion = informacion;
        this.enlace = null;
    }
    
    public Object getInformacion(){
        return this.informacion;
    }
    
    public void setInformacion(Object informacion){
        this.informacion = informacion;
    }
    
    public Nodo getEnlace(){
        return this.enlace;
    }
    

    public void setEnlace(Nodo siguiente){
        this.enlace = siguiente;        
     }               
}
