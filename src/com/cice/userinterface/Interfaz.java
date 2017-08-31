/*
 * Interfaz gráfica de la aplicación
 */
package com.cice.userinterface;

import com.cice.logica.Logica;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Interfaz {

    //atributos locales de la clase
    private Scanner sc = new Scanner(System.in);
    private int opcion = 0;
    private int numA = 0;
    private int numB = 0;
    private int resultado = 0;

    private Logica logica = new Logica();

    //métodos propios de la clase interfaz
    public void iniciar() {
        mostrarMenu();
    }

    private void mostrarMenu() {
        System.out.println("POO CALCULADORA");
        System.out.println("=================");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        System.out.println("=================");
        getOpcion();

    }

    private void getOpcion() {
        do {
            System.out.print("Selecciona una opción: ");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 0:
                        System.out.println("Gracias por utilizar mi programa");
                        System.out.println("Hasta pronto!");
                        break;
                    case 1:
                        getNumeros();
                        resultado = logica.sumar(numA, numB);
                        System.out.println("El resultado de la suma es: " + resultado);
                        break;
                    case 2:
                        getNumeros();
                        resultado = logica.restar(numA, numB);
                        System.out.println("El resultado de la resta es: " + resultado);
                        break;
                    case 3:
                        getNumeros();
                        resultado = logica.multiplicar(numA, numB);
                        System.out.println("El resultado de la multiplicación es: " + resultado);
                        break;
                    case 4:
                        getNumeros();
                        resultado = logica.dividir(numA, numB);
                        System.out.println("El resultado de la división es: " + resultado);
                        break;

                    default:
                        System.out.println("ERROR:La opción elegida es incorrecta");
                }
            } catch (InputMismatchException ime) {
                System.out.println("ERROR:Debe elegir un número");
                sc.next();
                opcion = 1;
            }
            
        } while (opcion != 0);

    }

    private void getNumeros() {
        boolean numeric = false;
        do {
            System.out.print("Introduce el primer número: ");
            if (sc.hasNextInt()) {
                numeric = true;
                numA = sc.nextInt();
            } else {
                System.out.println("ERROR:Debe de introducir un número.");
                sc.next();
            }
        } while (!numeric);

        numeric = false;
        do {
            System.out.print("Introduce el segundo número: ");
            if (sc.hasNextInt()) {
                numeric = true;
                numB = sc.nextInt();
            } else {
                System.out.println("ERROR:Debe de introducir un número");
                sc.next();
            }
        } while (!numeric);

    }

}
