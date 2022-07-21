/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ed.relacionpropiedades;

/**
 *
 * @author Usuario
 */
public class Relacion {

    private int[][] matriz;

    public Relacion(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }


    public boolean P_Reflexiva() {
        boolean reflexiva = true;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] == 0) {
                reflexiva = false;
                break;
            }
        }
        return reflexiva;
    }

    public boolean P_Irreflexiva() {
        boolean irreflexiva = true;
        for (int i = 0; i < matriz.length ; i++) {
            if (matriz[i][i] == 1) {
                irreflexiva = false;
                break;
            }
        }
        return irreflexiva;
    }    

    public boolean P_Simetrica() {
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean P_Antisimetrica() {
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i][j] == 1 &&  matriz[j][i] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean P_Asimetrica() {
        if (P_Irreflexiva() && P_Antisimetrica())
            return true;
        return false;
    }
    
    public boolean P_Transitiva() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[i][j] == 1 && matriz[j][k] == 1 && matriz[i][k] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean P_Equivalencia() {
        if (P_Reflexiva() && P_Simetrica() && P_Transitiva())
            return true;
        return false;
    }

}
