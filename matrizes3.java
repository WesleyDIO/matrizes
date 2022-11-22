
import java.util.Scanner;
public class atv3 {
 public static void main (String []args) {
	 Scanner entrada = new Scanner (System.in);
	 
	 int matriz [] [] = new int [5][5], soma [] = new int [5];
	 
	 for(int i = 0 ; i < 5 ; i++) {
		 for(int n = 0 ;  n < 5 ; n++) {
			 System.out.println("Digite um valor;");
			 matriz [i] [n] = entrada.nextInt();
			 
			 if( i == 4) {
				 soma[0]+= matriz [i][n];
			 }if(n == 2) {
				 soma[1] += matriz [i] [n];
			 }if( i == n) {
				 soma[2] += matriz [i] [n];
			 }if(i+n == 2) {
				 soma[3] += matriz [i] [n];
			 }
			  soma[4] += matriz [i] [n] ;
		 }
	 }
	    System.out.println("A soma da linha 4 é "+ soma[0]);
	    System.out.println("A soma da coluna 2 é "+ soma[1]);
	    System.out.println("A soma da diagonal principal é "+ soma[2]);
	    System.out.println("A soma da diagonal secundaria é "+ soma[3]);
	    System.out.println("A soma de todos os elementos da matriz é "+ soma[4]);
 }
}
