import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int []m[]={ { 4 , 1 , 2 , 3 } , { 5 , 2 , 1 , 400 } , { 2 , 1 , 3 , 8 } , { 7 , 1 , 2 , 5} };
        int n, valor=0,k,l;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de itinerarios");
        n=input.nextInt();
        int[] v=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite o itinerário");
            v[i]=input.nextInt();
        }
        for(int i=0;i<v.length-1;i++){
            k=v[i];
            l=v[i+1];
            valor+=m[k][l];
        }
        System.out.println("Valor itinerario "+valor);

    }
}