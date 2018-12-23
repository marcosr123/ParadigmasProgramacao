/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadayz;

import static java.lang.Math.pow;
import java.util.Scanner;

public class quatro {

    public static float gambler(int n1, int n2, int at)
    {
     float p; 
            if(at == 3)
            { 
                    // probabiliy with 50% (Fair Coin) 
                    return (float)n1/(float)(n1+n2);
            }
            else
            { 
                    // unFair Coin P2 law is the answer for player1 
                    p = (float) (1.0 - (6-at)/6.0); 
                    p = (1 - p)/p; 
                    return (float) ((1.0 - pow(p,n1))/(1.0 - pow(p,n1+n2)));
            }

    }
    public static void main(String[] args) {
        int ev1,ev2,at,d,tmp; 
	float prop;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de baralhas");
        int num1 = sc.nextInt();
        for(int i=0;i<num1;i++)
        {
            System.out.println("Digite os dados da luta");
            ev1 = sc.nextInt();
            ev2 = sc.nextInt();
            at = sc.nextInt();
            d = sc.nextInt();
                    tmp = ev1; 
                    ev1 = 0; 
                    while(tmp > 0)
                    { 
                            tmp -= d; 
                            ev1++; 
                    } 
                    tmp= ev2; 
                    ev2 = 0; 
                    while(tmp > 0)
                    { 
                            tmp -= d; 
                            ev2++; 
                    } 
                    prop = gambler(ev1,ev2,at); 
                    System.out.println(prop*100); 
        }
    }
    
}
