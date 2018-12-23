/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade14;

/**
 *
 * @author Luis Ricardo
 */
public class Funcionario {
    private String nome;
    private Double sal;
    private int hed;
    private int hen;
    private int nd;
    private int fal;
    private double de;
    private double ref;
    private int val;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public int getHed() {
        return hed;
    }

    public void setHed(int hed) {
        this.hed = hed;
    }

    public int getHen() {
        return hen;
    }

    public void setHen(int hen) {
        this.hen = hen;
    }

    public int getNd() {
        return nd;
    }

    public void setNd(int nd) {
        this.nd = nd;
    }

    public int getFal() {
        return fal;
    }

    public void setFal(int fal) {
        this.fal = fal;
    }

    public double getDe() {
        return de;
    }

    public void setDe(double de) {
        this.de = de;
    }

    public double getRef() {
        return ref;
    }

    public void setRef(double ref) {
        this.ref = ref;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    
    public void FolhaPag(){
        System.out.println("----------------\nNome: "+this.getNome()+"\nSalario: "+this.getSal()+"Horas Extras: "+this.getHed()*(this.getSal()/160)+(this.getHed()*1.2*(this.getSal()/160))+"\nSalário Familia: "+this.getNd()*0.05*954+"Salario Bruto: "+this.getSal()+this.getHed()*(this.getSal()/160)+(this.getHed()*1.2*(this.getSal()/160))+this.getNd()*0.05*954+"/nDescontos efetuados: \nINAMPS: "+0.08*this.getSal()+"\nFaltas: "+this.getFal()*(this.getSal()/160)+"Refeições: "+this.getRef()+"\nVales: "+this.getVal());
    }
    
}
