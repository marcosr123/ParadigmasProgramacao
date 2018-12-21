/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facil;

import java.util.*;

/**
 *
 * @author aluno
 */
public class Questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float FemPercent;
        int idade, MaxIdade=0,contPercent=0,cont=0;
        String sexo, corOlhos, corCabelo;
        
        do{
            cont++;
            System.out.println("Digite o sexo: ");
            sexo = scan.nextLine();
            System.out.println("Digite a cor dos olhos: ");
            corOlhos = scan.nextLine();
            System.out.println("Digite a cor do cabelo: ");
            corCabelo = scan.nextLine();
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            if (verificaPercent(idade,sexo,corOlhos,corCabelo)){
                contPercent++;
            }
            if (idade > MaxIdade){
                MaxIdade = idade;
            }
        }while(idade!=-1);
        FemPercent = (100*contPercent)/100;
        
        System.out.println("Maior Idade: "+idade);
        System.out.println("Porcentagem feminina com olhos verdes, cabelos loiros e que estão entre 18 e 35 anos: +"+(FemPercent));
        
    }
    public static boolean verificaPercent (int idade,String sexo,String corOlhos,String corCabelo){
        if(sexo.equals("feminino")&& (idade>=18 && idade <=35) && corOlhos.equals("verdes") && (corCabelo.equals("loiros") || corCabelo.equals("louros"))){
            return true;
        }
        return false;
    }
    
}
