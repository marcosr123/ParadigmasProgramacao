
package questao9;

import java.util.Scanner;


public class Questao9 {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      double custoFabrica;
      double custoComs;
      
        System.out.println("DIGITE O CUSTO DE FABRICA DO CARRO:");
        custoFabrica= input.nextDouble();
        
        custoComs = (custoFabrica*0.28) + (custoFabrica*0.35);
        
        
       System.out.println("O CUSTO AO CONSUMIDOR:"+custoComs);
      
    }
    
}
