/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.matrizboleana;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Matriz_Booleana {

    int[][] A;
    int[][] B;
    private int num_fil_A;
    private int num_fil_B;
    private int num_col_A;
    private int num_col_B;

    public Matriz_Booleana(int[][] A, int[][] B, int num_fil_A, int num_col_A, int num_fil_B, int num_col_B) {

        this.A = A;
        this.B = B;
        this.num_fil_A = num_fil_A;
        this.num_fil_B = num_fil_B;
        this.num_col_A = num_col_A;
        this.num_col_B = num_col_B;
    }

    public int[][] getA() {
        return A;
    }

    public int[][] getB() {
        return B;
    }

    public int getNum_fil_A() {
        return num_fil_A;
    }

    public int getNum_fil_B() {
        return num_fil_B;
    }

    public int getNum_col_A() {
        return num_col_A;
    }

    public int getNum_col_B() {
        return num_col_B;
    }

    public void setA(int[][] A) {
        this.A = A;
    }

    public void setB(int[][] B) {
        this.B = B;
    }

    public void setNum_fil_A(int num_fil_A) {
        this.num_fil_A = num_fil_A;
    }

    public void setNum_fil_B(int num_fil_B) {
        this.num_fil_B = num_fil_B;
    }

    public void setNum_col_A(int num_col_A) {
        this.num_col_A = num_col_A;
    }

    public void setNum_col_B(int num_col_B) {
        this.num_col_B = num_col_B;
    }

    public int[][] junta() {
        int[][] R = new int[num_fil_A][num_col_A];
        for (int i = 0; i < num_fil_A; i++) {
            for (int j = 0; j < num_col_A; j++) {
                if (A[i][j] == 0 && B[i][j] == 0) {
                    R[i][j] = 0;
                } else {
                    R[i][j] = 1;
                }
            }
        }
        return R;
    }

    public int[][] reunion() {
        int[][] R = new int[num_fil_A][num_col_A];
        for (int i = 0; i < num_fil_A; i++) {
            for (int j = 0; j < num_col_A; j++) {
                R[i][j] = A[i][j] * B[i][j];
            }
        }
        return R;
    }

    public int[][] Producto(int[][] A, int[][] B) {
        int[][] R = new int[A.length][B[0].length];
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    R[i][j] += A[i][k] * B[k][j];
                    if (R[i][j] == 0) {
                        R[i][j] = 0;
                    } else {
                        R[i][j] = 1;
                    }
                }
            }
        }
        return R;
    }

    public int[][] Relaciones(int[][] matriz, int relaciones) {
        int[][] auxiliar = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                auxiliar[i][j] = matriz[i][j];
            }
        }
        for (int x = 1; x < relaciones; x++) {
            auxiliar = this.Producto(auxiliar, matriz);
        }
        return auxiliar;
    }
    
}
