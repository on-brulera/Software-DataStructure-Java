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
public class TransfInfPost {

    Pila p;
    String ExpInf;
    char[] AInf;
    char[] APost;
    int ncar;

    public TransfInfPost(String ExpInf) {
        this.ExpInf = ExpInf;
        ncar = ExpInf.length();
        this.p = new Pila(ncar);
        this.AInf = new char[ncar];
        this.APost = new char[ncar];
    }

    public void ConvertirArregloInfijo() {
        for (int i = 0; i < ncar; i++) {
            AInf[i] = ExpInf.charAt(i);
        }
    }

    public int prioridad(char car) {
        int prior = -1;
        switch (car) {
            case '+':
            case '-': {
                prior = 1;
                break;
            }
            case '*':
            case '/': {
                prior = 2;
                break;
            }
            case '^': {
                prior = 3;
                break;
            }
        }
        return prior;
    }

    public void TransformarPostfijo() {
        int j = 0;
        for (int i = 0; i < this.ncar; i++) {
            if (p.vacio() && prioridad(AInf[i]) != -1) {
                p.apilar(AInf[i]);
            } else {
                if (prioridad(AInf[i]) == -1) {
                    this.APost[j] = AInf[i];
                    j++;
                } else {
                    if (prioridad(AInf[i]) > prioridad((char) p.cima())) {
                        p.apilar(AInf[i]);
                    } else {
                        if (prioridad(AInf[i]) <= prioridad((char) p.cima())) {
                            while (!p.vacio() && (prioridad(AInf[i]) <= prioridad((char) p.cima()))) {
                                APost[j] = (char) p.Desapilar();
                                j++;
                            }
                            p.apilar(AInf[i]);
                        }
                    }
                }
            }
        }
        while (!p.vacio()) {
            APost[j] = (char) p.Desapilar();
            j++;
        }
    }

    public String RetornarExpPostfija() {
        String r = "";
        for (int i = 0; i < ncar; i++) {
            r += APost[i];
        }
        return r;
    }
}
