
package questao6;

import java.util.Random;


public class Questao6 {

    public static int negativo(int v[]){
        int n = 0;
        
        for(int i = 0; i < v.length; i++){
            if(v[i] < 0){
                n++;
            }
        } 
        return n;
    }

  
    public static void main(String[] args) {
        int v[] = new int[50];
        int x;
      
        Random random = new Random();

  for(int i=0;i<50;i++){
      x = -100 + random.nextInt(101);
      v[i] = x;
  }
        
   int n = negativo(v);
   System.out.println("numeros negativos "+n);
  }
}
