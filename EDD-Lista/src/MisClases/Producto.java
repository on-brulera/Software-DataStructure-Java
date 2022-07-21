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
public class Producto {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private int cantidadMinima;

    public Producto(String codigo, String nombre, int cantidad, double precio, int cantidadMinima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.cantidadMinima = cantidadMinima;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }
            
}
