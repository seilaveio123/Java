import java.util.Scanner;
public class Negativos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos n�meros voc� ir� digitar?");
		int num = in.nextInt();
		int []n�meros =  new int [num];
		
		for ( int i= 0; i<n�meros.length; i++) {
			System.out.println("Digite o n�mero # " + (i + 1) + ": ");
	        n�meros[i] = in.nextInt();
	        }
		for (int x : n�meros) {
			if ( x < 0) {
				System.out.println("Os n�meros negativos s�o:" + x);
				
			}
		}
		
	}

}
