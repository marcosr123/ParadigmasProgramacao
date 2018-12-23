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
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado d = new Quadrado();
        Retangulo r=new Retangulo();
        Triangulo t=new Triangulo();
        Circulo c=new Circulo();
        
        d.setLado(2);
        r.setComprimento(10);
        r.setLargura(2);
        t.setAltura(10);
        t.setBase(4);
        c.setRaio(3);
        
        d.area();
        r.area();
        t.area();
        c.area();
        
        System.out.println(d.area);
        System.out.println(r.area);
        System.out.println(t.area);
        System.out.println(c.area);
        
    }
    
}
