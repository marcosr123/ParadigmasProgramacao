/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author Luis Ricardo
 */
public class Quadrado extends Forma {
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    /**
     *
     * 
     */
    @Override
    public void area(){
        this.area=lado*lado;
    }
    
}
