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
public class tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o numero de dias");
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num1 = sc.nextInt();
        for(int i =0;i<num1;i++)
        {
            System.out.println("Digite a dieta");
            String vem = in.readLine();
            char[] c = vem.toCharArray();
            System.out.println("Digite o café da manha e almoço");
            String vem2 = in.readLine();
            char[] c2 = vem2.toCharArray();
            String vem3 = in.readLine();
            char[] c3 = vem3.toCharArray();
            int cont = 0;
            String falta = "";
            int insp=0;
            // Pertence
            while(insp < 1 || insp == 2)
            {
                for(int j=0;j<c2.length;j++)
                {
                    for(int k=0;k<c.length;k++)
                    {
                        if(c[k] == c2[j])
                        {
                            cont++;
                        }
                    }
                    if(cont == 0)
                    {
                        insp=2;
                        System.out.println("CHEATER");
                        break;
                    }
                    cont=0;
                }
                for(int j=0;j<c3.length;j++)
                {
                    for(int k=0;k<c.length;k++)
                    {
                        if(c[k] == c3[j])
                        {
                            cont++;
                        }
                    }
                    if(cont == 0)
                    {
                        insp=2;
                        System.out.println("CHEATER");
                        break;
                    }
                    cont=0;
                }
                //repetido 
                for(int j=0;j<c.length;j++)
                {
                    for(int k=0;k<c2.length;k++)
                    {
                        if(c[j] == c2[k])
                        {
                            cont++;
                        }
                    }
                    if(cont>2)
                    {
                        insp=2;
                        System.out.println("CHEATER");
                        break;
                    }
                    cont=0;
                }
                for(int j=0;j<c.length;j++)
                {
                    for(int k=0;k<c3.length;k++)
                    {
                        if(c[j] == c3[k])
                        {
                            cont++;
                        }
                    }
                    if(cont>2)
                    {
                        insp=2;
                        System.out.println("CHEATER");
                        break;
                    }
                    cont=0;
                }
                if(insp==2)
                {
                    break;
                }
                else
                {
                    insp=1;
                }
            }
            // dieta
            if(insp!=2)
            {
                for(int j=0;j<c.length;j++)
                {
                    for(int k=0;k<c2.length;k++)
                    {
                        if(c[j] == c2[k])
                        {
                            cont++;
                        }
                    }
                    for(int k=0;k<c3.length;k++)
                    {
                        if(c[j] == c3[k])
                        {
                            cont++;
                        }
                    }
                    if(cont == 0)
                    {
                        falta = falta + Character.toString(c[j]);
                    }
                    cont=0;
                }
                System.out.println(falta);  
            }
            
        }
    }
    
}
