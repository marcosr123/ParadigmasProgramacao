/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediario;
import java.util.*;

/**
 *
 * @author aluno
 */
public class Questão1 {
    public static void main(String[] args) {
        int [][]A = new int[50][50];
        int m,n,i,j;
        int rotulo = 1,inicio = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os valores de m e n, respectivamente: ");
        m= scan.nextInt();
        n=scan.nextInt();
        System.out.println("Digite os elementos da matriz: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                A[i][j] = scan.nextInt();
            }
        }
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
              inicio = 0;
              if(A[i][j] == 0){
                if(j == 0){
                  if(A[i][1] != -1)
                    inicio = 1;
                }
                else if(A[i][j-1] == -1 && j < n-1){
                  if(A[i][j+1] != -1)
                    inicio = 1;
                }
              }
              if(A[i][j] == 0){
                if(i == 0){
                  if(A[1][j] != -1)
                    inicio = 1;
                }
                else if(A[i-1][j] == -1 && i < m-1){
                  if(A[i+1][j] != -1)
                    inicio = 1;
                }
              }
              if(inicio == 1){
                A[i][j] = rotulo;
                rotulo++;
              }
            }
        }
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.println(A[i][j]);
            }
        }
    }
    
    
}
