
package questao.pkg8;

import java.util.Scanner;


public class Questao8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double saldo;
        double valor;
        
        System.out.println("digite o saldo medio do ultimo ano:");
        saldo = input.nextDouble();
        
        if(saldo >= 0 && saldo <= 200){
            valor=0;
            System.out.println("NENHUM CREDITO FOI CONCEDIDO");
        }
        if(saldo > 200 && saldo <= 400){
            valor= saldo * 0.2;
             System.out.println("SALDO:"+saldo);
            System.out.println("VALOR DO CREDITO:"+valor);
        }
        if(saldo > 400 && saldo <= 600){
            valor=saldo * 0.3;
             System.out.println("SALDO:"+saldo);
            System.out.println("VALOR DO CREDITO:"+valor);
        }
        if(saldo > 600){
            valor= saldo * 0.4;
             System.out.println("SALDO:"+saldo);
            System.out.println("VALOR DO CREDITO:"+valor);
        }
        
        
       
    }
    
}
