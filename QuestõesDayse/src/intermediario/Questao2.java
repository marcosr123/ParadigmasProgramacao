import java.util.Scanner

public class Metodos{
	
	public static void main(String[] args){
		int mat = new int[8][8];
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				mat[i][j] == new Scanner(System.in).nextInt();
			}
		}
		
		//Letra a
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(mat[i][j] == -1 && j == 0){
					if(mat[i+1][j+1] == 1){
						System.out.println("Posição: "+i+""+j+" pode comer");
					}else if(mat[i][j] == -1 && j == 7){
						if(mat[i-1][j-1] == 1){
							System.out.println("Posição: "+i+""+j+" pode comer");
						}else if(mat[i][j] == -1){
							if(mat[i+1][j-1] == 1 || mat[i-1][j+1] == 1){
								System.out.println("Posição: "+i+""+j+" pode comer");
							}
						}
					}	
				}
			}
		}
		
		//Letra b
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(mat[i][j] == -1 && j == 0){
					if(mat[i+1][j+1] != 1){
						System.out.println("Posição: "+i+""+j+" não toma peça");
					}else if(mat[i][j] == -1 && j == 7){
						if(mat[i-1][j-1] != 1){
							System.out.println("Posição: "+i+""+j+" não toma peça");
						}else if(mat[i][j] == -1){
							if(mat[i+1][j-1] != 1 || mat[i-1][j+1] != 1){
								System.out.println("Posição: "+i+""+j+" não toma peça");
							}
						}
					}	
				}
			}
		}
		
		//Letra c
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i == 0){
					System.out.println("Posição: "+i+""+j+" não pode se movimentar");
				}
			}
		}
		
		
		
	}
}