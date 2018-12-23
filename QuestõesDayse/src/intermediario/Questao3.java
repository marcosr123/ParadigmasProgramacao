import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    int numero_de_operacoes,numero_de_clientes,cont=0,id,resposta=0;
    int numero_da_conta;
    double saldo;
    String letra;
    List<Conta> lista = new ArrayList<>();
    List<Operacoes> lista2 = new ArrayList<>();
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Entre com o número de clientes");
    numero_de_clientes=input.nextInt();
    while(cont<numero_de_clientes){
        if(lista.isEmpty()){
            System.out.println("Digite o ID do cliente");
            id= input.nextInt();
            System.out.println("Digite o numero da conta");
            numero_da_conta=input.nextInt();
            System.out.println("Digite o saldo da conta");
            saldo=input.nextDouble();
            lista.add(new Conta(id,numero_da_conta,saldo));
            cont++;
        }else{
        do{
            System.out.println("Digite o ID do cliente");
            id= input.nextInt();
            for(int i=0;i<lista.size();i++){
                if(lista.get(i).id_cliente==id){
                    resposta=-1;
                    System.out.println("ID indisponivel");
                    break;
                }
            }
        }while(resposta!=0);
        resposta=0;
        do{
            System.out.println("Digite o numero da conta");
            numero_da_conta=input.nextInt();
            for(int i=0;i<lista.size();i++){
                 if(lista.get(i).numero_da_conta==numero_da_conta){
                    System.out.println("Indisponível");
                    resposta=-1;
                    break;
                }           
            }
            
        }while(resposta!=0);
        resposta=0;
        System.out.println("Digite o saldo da conta");
        saldo=input.nextDouble();
        lista.add(new Conta(id,numero_da_conta,saldo));
        cont++;        
        }
    }
    for(int i=0;i<lista.size();i++){
        System.out.println(lista.get(i).numero_da_conta+" "+lista.get(i).id_cliente+" "+lista.get(i).saldo);
    }
        cont=0;
        System.out.println("Entre com o numero de operações");
        numero_de_operacoes=input.nextInt();
        while(cont<numero_de_operacoes){
            do{
                System.out.println("Digite o numero da conta, digitar outro caso nao encontrado");
                numero_da_conta=input.nextInt();
                for(int i=0;i<lista.size();i++){
                    if(lista.get(i).numero_da_conta==numero_da_conta){
                        resposta=-1;
                        break;
                    }
                }
            }while(resposta!=-1);
            resposta=0;
            System.out.println("Credito ou debito? \nC-Credito\nD-Debito");
            input.nextLine();
            letra=input.nextLine();
            System.out.println("Digite o valor");
            saldo=input.nextDouble();
            lista2.add(new Operacoes(letra,saldo,numero_da_conta));
            cont++;
        }
        
        for(int i=0;i<lista.size();i++){
            for(int j=0;j<lista2.size();j++){
                if(lista.get(i).numero_da_conta==lista2.get(j).id_da_conta){
                    lista.get(i).saldo-=lista2.get(j).valor_operacao;
                    break;
                }
            }
        }
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).id_cliente+" numero da conta "+lista.get(i).numero_da_conta+" saldo "+lista.get(i).saldo);
        }

    lista.clear();
    lista2.clear();

        
   }
        
}

public class Conta {
    int id_cliente;
    int numero_da_conta;
    double saldo;

    public Conta(int id_cliente, int numero_da_conta, double saldo) {
        this.id_cliente = id_cliente;
        this.numero_da_conta = numero_da_conta;
        this.saldo = saldo;
    }
}


public class Operacoes {
    String letra;
    double valor_operacao;
    int id_da_conta;

    public Operacoes(String letra, double valor_operacao, int id_da_conta) {
        this.letra = letra;
        this.valor_operacao = valor_operacao;
        this.id_da_conta = id_da_conta;
    }
}