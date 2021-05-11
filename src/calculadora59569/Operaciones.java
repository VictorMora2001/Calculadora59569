/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora59569;

/**
 *
 * @author amigo
 */
public class Operaciones {
 double primerValor, segundoValor;

    public void setValores(double x, double y) {
        this.primerValor = x;
        this.segundoValor = y;
    }

    public double Suma() {
        return primerValor + segundoValor;
    }

    public double Resta() {
        return primerValor - segundoValor;
    }

    public double Multiplicacion() {
        return primerValor * segundoValor;
    }

    public Double Division() {
      return primerValor / segundoValor;
    }
    
    public String ErrorDivision() {
        return "No puede dividir entre cero.";
    }

}
