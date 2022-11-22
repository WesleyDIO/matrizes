
import java.util.Scanner;
public class atv5 {
    public static void main (String []args) {
    	Scanner entrada = new Scanner (System.in);
    	
    	int matriz [][] = new int [3][4];
    	int cantoSuperior=0, cantoInferior=0;
    	
    	for(int i = 0 ; i < 3 ; i++) {
    		for(int n = 0 ; n < 4 ; n++) {
    			System.out.println("Digite os valores da matriz: ");
    			matriz [i][n] = entrada.nextInt();
    			 
    			if(n == 0 && i == 0 ) {
    				cantoSuperior = matriz[i][n];
    			}if( n == 0 && i == 2) {
    				cantoInferior = matriz[i][n];
    			}
    		}
    	}
    	   System.out.println("O valor do canto Superior esquerdo é "+cantoSuperior);
    	   System.out.println("O valor do canto Inferior esquerdo é "+cantoInferior);
    }
}
