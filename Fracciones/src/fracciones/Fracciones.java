/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

import java.util.*;

/**
 *
 * @author Usuario DAM 1
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion1, opcion2;
        double numero;

        Operaciones miOperacion = new Operaciones();

        System.out.print("Introduzca el numerador: ");
        miOperacion.setNumerador(sc.nextDouble());
        System.out.print("Introduzca el denominador: ");
        miOperacion.setDenominador(sc.nextDouble());

        System.out.println("¿Quieres invertir la fracción?");
        System.out.println("SI------------------>1");
        System.out.println("NO------------------>2");
        opcion1 = sc.nextInt();

        System.out.println("");

        if (opcion1 == 1) {
            System.out.println("---------MENU---------");
            System.out.println("Multiplicación------>1");
            System.out.println("División------------>2");
            System.out.println("Suma---------------->3");
            System.out.println("Resta--------------->4");
            System.out.println("¿Qué operación quieres realizar?");
            opcion2 = sc.nextInt();

            miOperacion.Inversion();

            if (opcion2 == 1) {
                System.out.println("¿Por qué número lo quieres multiplicar?");
                numero = sc.nextDouble();
                miOperacion.Multiplicacion(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else if (opcion2 == 2) {
                System.out.println("¿Por qué número lo quieres dividir?");
                numero = sc.nextDouble();
                miOperacion.Division(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else if (opcion2 == 3) {
                System.out.println("A qué número quieres sumar la fracción");
                numero = sc.nextDouble();
                miOperacion.Suma(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else if (opcion2 == 4) {
                System.out.println("A qué número quieres restar la fracción");
                numero = sc.nextDouble();
                miOperacion.Resta(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else {
                System.out.println("ERROR");
            }

        } else if (opcion1 == 2) {
            System.out.println("---------MENU---------");
            System.out.println("Multiplicación------>1");
            System.out.println("División------------>2");
            System.out.println("Suma---------------->3");
            System.out.println("Resta--------------->4");
            System.out.println("¿Qué operación quieres realizar?");
            opcion2 = sc.nextInt();

            if (opcion2 == 1) {
                System.out.println("¿Por qué número lo quieres multiplicar?");
                numero = sc.nextDouble();
                miOperacion.Multiplicacion(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else if (opcion2 == 2) {
                System.out.println("¿Por qué número lo quieres dividir?");
                numero = sc.nextDouble();
                miOperacion.Division(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else if (opcion2 == 3) {
                System.out.println("A qué número quieres sumar la fracción");
                numero = sc.nextDouble();
                miOperacion.Suma(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else if (opcion2 == 4) {
                System.out.println("A qué número quieres restar la fracción");
                numero = sc.nextDouble();
                miOperacion.Resta(numero);
                System.out.println("La fracción resultante será: " + miOperacion.getNumerador() + "/" + miOperacion.getDenominador());
            } else {
                System.out.println("ERROR");
            }
        }

    }

}
