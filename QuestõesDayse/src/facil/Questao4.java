
package questao4;

import java.util.Scanner;
public class Questao4 {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
String[] nome = new String[4];
double[] nota = new double[4];
double soma = 0;
double media;
double maior = 0;

for(int i = 0; i < 4; i++){
    System.out.println("Digite o nome numero "+(i+1)+" : ");
    nome[i] = input.nextLine();
    
    System.out.println("Digite a nota "+(i+1)+" : ");
   nota[i] = Double.parseDouble(input.nextLine());
    soma = soma + nota[i];
}
   
  media = soma/4;

for(int i = 0; i < 4; i++){
  if(nota[i] > media){
      maior = nota[i];
     System.out.println("O aluno "+nome[i]+" possui média "+maior+", maior que a média da turma que e :"+media);
     
  }         
}  
}
}
    
