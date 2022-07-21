/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.funcionescaracteristicas;

/**
 *
 *
 */
public class FuncionCaracteristica {

    public String[] universo;
    public String[] A;
    public String[] B;
    public int[] Funcion_Universo;
    public int[] Funcion_A;
    public int[] Funcion_B;

    public FuncionCaracteristica(String[] universo, String[] A, String[] B) {
        this.universo = universo;
        this.A = A;
        this.B = B;
        this.Funcion_Universo = new int[this.universo.length];
        this.Funcion_A = new int[this.universo.length];
        this.Funcion_B = new int[this.universo.length];
    }

    public void LLENAR_UNIVERSO() {
        for (int x = 0; x < this.universo.length; x++) {
            this.Funcion_Universo[x] = 1;
        }
    }

    public void LLENAR_A() {
        for (int i = 0; i < this.A.length; i++) {
            for (int j = 0; j < this.universo.length; j++) {
                if (this.A[i].equals(this.universo[j])) {
                    this.Funcion_A[j] = 1;
                }
            }
        }
    }

    public void LLENAR_B() {
        for (int i = 0; i < this.B.length; i++) {
            for (int j = 0; j < this.universo.length; j++) {
                if (this.B[i].equals(this.universo[j])) {
                    this.Funcion_B[j] = 1;
                }
            }
        }
    }

    public int[] UNION() {
        int[] Funcion_resultado = new int[this.universo.length];
        for (int x = 0; x < this.universo.length; x++) {
            Funcion_resultado[x] = this.Funcion_A[x] + this.Funcion_B[x] - (this.Funcion_A[x] * this.Funcion_B[x]);
        }
        return Funcion_resultado;
    }

    public int[] INTERSECCION() {
        int[] Funcion_resultado = new int[this.universo.length];
        for (int x = 0; x < this.universo.length; x++) {
            Funcion_resultado[x] = this.Funcion_A[x] * this.Funcion_B[x];
        }
        return Funcion_resultado;
    }

    public int[] DIFERENCIA() {
        int[] Funcion_resultado = new int[this.universo.length];
        for (int x = 0; x < this.universo.length; x++) {
            Funcion_resultado[x] = this.Funcion_A[x] - (this.Funcion_A[x] * this.Funcion_B[x]);
        }
        return Funcion_resultado;
    }

    public int[] DIFERENCIA_SIMETRICA() {
        int[] Funcion_resultado = new int[this.universo.length];
        for (int x = 0; x < this.universo.length; x++) {
            Funcion_resultado[x] = this.Funcion_A[x] + this.Funcion_B[x] - 2 * (this.Funcion_A[x] * this.Funcion_B[x]);
        }
        return Funcion_resultado;
    }

    public int[] COMPLEMENTO_A() {
        int[] Funcion_resultado = new int[this.universo.length];
        for (int x = 0; x < this.universo.length; x++) {
            Funcion_resultado[x] = this.Funcion_Universo[x] - this.Funcion_A[x];
        }
        return Funcion_resultado;
    }

    public String REVISAR_CONJUNTO(int[] conjunto_A, int[] conjunto_B) {
        int opcion = 0;

        for (int x = 0; x < conjunto_B.length; x++) {
            for (int y = 0; y < conjunto_A.length; y++) {
                if (conjunto_A[x] == conjunto_B[y]) {
                    opcion++;
                }
            }
        }
        if (opcion == conjunto_B.length && conjunto_B.length != conjunto_A.length) {
            return "El conjunto B pertence al conjunto A";
        } else {
            if (opcion == conjunto_B.length && conjunto_B.length == conjunto_A.length) {
                return "El conjunto B pertence al conjunto A" + " y " + "El conjunto A pertence al conjunto B";
            } else {
                return "El conjunto B no pertenece al conjunto A";
            }
        }
    }

    public int[] COMPLEMENTO_B() {
        int[] Funcion_resultado = new int[this.universo.length];
        for (int x = 0; x < this.universo.length; x++) {
            Funcion_resultado[x] = this.Funcion_Universo[x] - this.Funcion_B[x];
        }
        return Funcion_resultado;
    }

    public String RETORNAR_STRING(int[] respuesta) {
        String texto = "";
        for (int x = 0; x < this.universo.length; x++) {
            if (respuesta[x] == 1) {
                texto = texto + this.universo[x] + " ";
            }
        }
        return texto;
    }

    public String SUBCONJUNTOS_AB() {
        String respuesta = "";
        int contador = 0;
        for (int x = 0; x < this.Funcion_A.length; x++) {
            for (int y = 0; y < this.Funcion_B.length; y++) {
                if (this.A[x].equals(this.B[y])) {
                    contador++;
                    break;
                }
            }
        }

        if (contador != this.Funcion_A.length) {
            respuesta = "El conjunto A no pertenece al conjunto B";
        } else {
            if (contador == this.Funcion_A.length && contador != this.Funcion_B.length) {
                respuesta = "El conjunto A pertenece al conjunto B";
            } else {
                if (contador == this.Funcion_A.length && contador == this.Funcion_B.length) {
                    respuesta = "El conjunto A pertenece al conjunto B y El conjunto B pertenece al conjunto A";
                }
            }
        }
        return respuesta;
    }

    public void ImprimirString(String[] lista) {
        System.out.print("lista: {");
        for (int x = 0; x < lista.length; x++) {
            if (x == lista.length - 1) {
                System.out.print(lista[x]);
            } else {
                System.out.print(lista[x] + "-");
            }
        }
        System.out.print("}");
        System.out.println("");
    }

    public void ImprimirFuncion(int[] lista) {
        System.out.print("Función: {");
        for (int x = 0; x < lista.length; x++) {
            if (x == lista.length - 1) {
                System.out.print(lista[x] + "");
            } else {
                System.out.print(lista[x] + "-");
            }
        }
        System.out.print("}");
        System.out.println("");
    }
}
