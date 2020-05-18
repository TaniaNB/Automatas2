/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author EQUIPO
 */
public class SimobolosValores {
    String Variable;
    String Valor;

    public String getVariable() {
        return Variable;
    }

    public void setVariable(String Variable) {
        this.Variable = Variable;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public SimobolosValores(String Variable, String Valor) {
        this.Variable = Variable;
        this.Valor = Valor;
    }
}
