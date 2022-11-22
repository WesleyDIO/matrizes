
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
