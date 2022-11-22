
import java.util.Scanner;
public class atv4 {
 public static void main (String []args) {
	 Scanner entrada = new Scanner (System.in);
	 
	 int matriz [][]= new int [5][5], matrizCubo [][] = new int [5][5];
	 
	 for(int i = 0; i < 5 ; i++) {
		 for (int n = 0 ; n < 5; n++) {
			 System.out.println("Digites os valores da matriz: ");
			 matriz[i][n] = entrada.nextInt();
			 
			 matrizCubo [i][n] = matriz [i][n] * matriz[i][n] * matriz[i][n];
		 }
	 }  System.out.println(" Os valores da matriz Cubo são: ");
	     for(int i = 0; i < 5 ; i++) {
		 for (int n = 0 ; n < 5; n++) {
			 
			 System.out.println("O valor da linha "+ i + " coluna "+ n + "=" + matrizCubo [i][n]);
	 }
		 }
 }
}
