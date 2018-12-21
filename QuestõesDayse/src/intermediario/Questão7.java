/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediario;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questão7 {
    public static void main (String[]Args){
        int [][]L = {{1,1,1,0},
                    {0,1,1,0},
                    {1,0,1,1},
                    {0,0,1,1}};
        int i,j,k,contI=0,contO=0,cont=0,contmaior=-1,cidademaior=-1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero da cidade(entre 0 e 3): ");
        k = scan.nextInt();
        for(i = 0;i<4;i++){
            if(k!=i){
                if (L[i][k]==1) contI++;
                if (L[k][i]==1) contO++;
            }
        }
        System.out.println(contO+" estradas saem e "+contI+" estradas chegam.");
    }
}
