
import java.util.Scanner;
public class atv2 {

	 public static void main (String[]args) {
		 
		 Scanner ran = new Scanner (System.in);
		 
		 int matriz[][] = new int [7][4];
		 int menor=99999;
		 String posicao="";
		 
		 for(int i = 0 ; i < 7; i++) {
			for(int n = 0 ; n < 4; n++) {
				System.out.println("Digite os números da matriz;");
				matriz[i][n] = ran.nextInt();
			}
		 }
		   for(int i = 0; i < 7; i++) {
			   for(int n = 0; n < 4; n++) {
				   if(matriz [i] [n] < menor) {
					   menor = matriz [i][n];
					   posicao =  i+ ":" + n;
				   }
			   }
		   }
		   System.out.println("O menor número é "+menor+" E esta localizado na posição "+ posicao);
	 }
	 
}
