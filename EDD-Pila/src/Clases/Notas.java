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
public class Notas {

    private String cédula;
    private String codigoMateria;
    private double nota1;
    private double nota2;
    private double notaSupletorio;

    public Notas(String cédula, String codigoMateria, double nota1, double nota2, double notaSupletorio) {
        this.cédula = cédula;
        this.codigoMateria = codigoMateria;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaSupletorio = notaSupletorio;
    }

    public String getCédula() {
        return cédula;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNotaSupletorio() {
        return notaSupletorio;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNotaSupletorio(double notaSupletorio) {
        this.notaSupletorio = notaSupletorio;
    }
    
    
}
