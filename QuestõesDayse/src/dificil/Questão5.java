/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadayz;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ListaDayZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valor do numero de elementos e do numero de perquisas");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Digite os " + num1 +" elementos");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a = in.readLine();
        String [] b = new String[40];
        b =  a.split(" ");
        System.out.println("Digite os " + num2 +" elementos da pesquisa");
        int [] i = new int[num2];
        for(int j=0;j<num2;j++)
        {
            i[j] = sc.nextInt();
            if(i[j]>num1)
            {
                int aux = i[j]%num1;
                System.out.println(b[aux-1]);
            }
            else
            {
                System.out.println(b[(i[j]-1)]);
            }
        }
    }
   
}
