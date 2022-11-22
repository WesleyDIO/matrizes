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
====================================================================================
  2.
  
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
=======================================================================================================
  3.
  
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
=========================================================================================================
4.

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
==================================================================================================================
5.

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
=======================================================================================================
6.

public class atv6 {
public static void main (String[]args) {
	
	int matriz [] [] = new int [7][8];
	String soma="";
	
	for(int i = 0 ; i < 7; i++) {
		for(int n = 0 ; n < 8; n++) {
			soma = i +":"+n+" = "+ i + "+"+ n +" = "+(i+n);
			System.out.println(soma);
		}
	}  
}
}
