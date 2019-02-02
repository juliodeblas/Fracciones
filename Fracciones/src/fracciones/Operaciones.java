/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

/**
 *
 * @author Usuario DAM 1
 */
public class Operaciones {

    private double numerador;
    private double denominador;

    public Operaciones() {
    }

    public Operaciones(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public void Inversion() {
        double aux;

        aux = numerador;
        numerador = denominador;
        denominador = aux;
    }

    public void Multiplicacion(double numero) {
        numerador = numerador * numero;
    }

    public void Division(double numero) {
        numerador = denominador * numero;
        denominador = numerador;
    }

    public void Suma(double numero) {
        numerador = (numero * denominador) + numerador;
    }
    
    public void Resta(double numero){
        numerador = (numero * denominador) - numerador;
    }
}
