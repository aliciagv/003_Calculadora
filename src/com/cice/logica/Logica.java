/*
 * Contiene todos los métodos lógicos de nuestra aplicación
 */
package com.cice.logica;

/**
 *
 * @author Alicia
 */
public class Logica {

    //Suma
    public int sumar(int numA, int numB) {
        //reglas de buena progracion
        // método con devolución, creamos una variable interna de ese tipo y se devuelve 
        int resultado = 0;
        resultado=numA+numB;
        return resultado;

    }

    //Resta
    public int restar(int numA, int numB) {
        int resultado = 0;
        resultado=numA-numB;
        return resultado;

    }
    //Multiplicación

    public int multiplicar(int numA, int numB) {
        int resultado = 0;
        resultado =numA * numB;
        return resultado;
    }

    //División
    public int dividir(int numA, int numB) {
        int resultado = 0;
        resultado =numA/numB;
        return resultado;
    }
}
