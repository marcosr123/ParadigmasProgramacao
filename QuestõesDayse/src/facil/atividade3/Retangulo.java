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
public class Retangulo extends Forma{
    private double largura;
    private double comprimento;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     *
     */
    @Override
    public void area(){
        this.area=largura*comprimento;
    }
    
    
    
}
