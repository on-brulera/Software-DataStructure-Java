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
public class Productos {

    private String codigoProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private int minimo;

    public Productos(String codigoProducto, String nombre, int cantidad, double precio, int minimo) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.minimo = minimo;
        this.precio = precio;
    }

    public String getCodigoProducto() {
        return codigoProducto;
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

    public int getMinimo() {
        return minimo;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
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

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

}
