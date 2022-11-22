"# matrizes" 
1.
  
  import java.util.Random;
public class matrizes {
 public static void main (String[]args) {
	 Random ran = new Random ();
	 
	 int [] [] numeros = new int [5] [5];
	 int soma, media=0, pares=0;
	 
	 for(int i = 0; i < numeros.length; i++) {
		 for(int n = 0; n < numeros.length; n++) {
			 
			 numeros [i] [n] = ran.nextInt(10);
			 System.out.println(numeros[i][n]);
	
			 if(numeros[i][n] %2 == 0) {
			   media += numeros [i][n];
			   pares++;
		 }
	 }
 } System.out.println("A media dos números pares é "+media/pares);
}
}
