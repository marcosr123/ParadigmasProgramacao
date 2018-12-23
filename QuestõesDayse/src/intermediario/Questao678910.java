import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int []m[]={{0,1,0,0},{1,1,1,1},{0,1,0,0},{0,0,0,0}};
        int cont=0,k,cidademaior=0,maior=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da cidade\n0<=cidade<4");
        k=input.nextInt();
        for(int i=0;i<4;i++){
            if(k!=i){
            cont+=m[k][i];
            }
        }
        System.out.println("Quantidade de entrada "+cont);
        cont=0;
         for(int i=0;i<4;i++){
            if(k!=i){
            cont+=m[i][k];
            }
        }
        System.out.println("Quantidade de saida "+cont) ;
        cont=0;

        //8² Questão
        for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               if(m[i][j]!=0){
               cont++;
               }
           }
           if(cont>maior){
               maior=cont;
               cidademaior=i;
           }
        }
        System.out.println("Cidade: "+cidademaior);
      
        //9² Questão
        System.out.println("Digite o numero da cidade\n0<=cidade<4");
        k=input.nextInt();
        cont=0;
        for(int i=0;i<4;i++){
            if(m[k][i]!=m[i][k]){
                cont=-1;
                break;
            }
        }
        
        if(cont!=0){
            System.out.println("Todas as entradas não são de via dupla");
        }else{
            System.out.println("Todas as entradas são de via dupla");
        }

        //10² Questão
        //I
        cont=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(m[i][j]==1){
                    cont=0;
                break;
                }
                if(m[i][j]==0&&m[j][i]==0){
                    cont=1;
                }
            }
            if(cont==1){
                break;
            }
        }  
        if(cont==1){
            System.out.println("Existem cidades isoladas");
        }else{
            System.out.println("Não existem cidades isoladas");
        }
        //II
        cont=0;
        k=-1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(m[j][i]==1){
                    cont=0;
                break;
                }
                cont=1;
            }
            if(cont==1){
                k=i;
                break;
            }
        }
        if(k!=-1){
        for(int i=0;i<4;i++){
            if(m[k][i]==1){
            cont=1;
            break;
            }
            cont=0;
        }
        }
         if(cont==1 && k!=-1){
            System.out.println("Existem cidades que há entrada e não há saída");
        }else{
            System.out.println("Não existem cidades que há entrada e não há saída");
        }       
        //III
        cont=0;
        k=-1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(m[i][j]==1){
                    cont=0;
                break;
                }
                cont=1;
            }
            if(cont==1){
                k=i;
                break;
            }
        }
        if(k!=-1){
            for(int i=0;i<4;i++){
                if(m[i][k]==1){
                cont=1;
                break;
                }
                cont=0;
            }
        }
         if(cont==1 && k!=-1){
            System.out.println("Existem cidades que há saída e não há entrada");
        }else{
            System.out.println("Não existem cidades que há saída e não há entrada");
        }       

        
        
        
    }
}
