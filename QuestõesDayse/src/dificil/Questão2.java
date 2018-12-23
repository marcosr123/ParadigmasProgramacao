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
public class dois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Digite o numero de strings");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite as Strings");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<num1;i++)
        {
            String vem = in.readLine();
            char[] c = vem.toCharArray();
            for(int j=0;j<c.length;j++)
            {
                if(Character.isLetter(c[j]))
                {
                    c[j] = (char) (c[j]+3);
                }
                if(j==0)
                {
                    vem = Character.toString(c[j]);
                }
                else
                {
                    vem = vem + Character.toString(c[j]);
                }
                
            }
            String invertida = new StringBuilder(vem).reverse().toString();
            //System.out.println(invertida);
            int a = invertida.length();
            int j;
            c = invertida.toCharArray();
            for(j=(a/2);j<a;j++)
            {
                c[j] = (char) (c[j]-1);
            }
            for(j=0;j<c.length;j++)
            {
                System.out.print(c[j]);
            }
            System.out.print("\r\n");
        }
    }
    
}
