import java.util.Scanner;
public class soma_vetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos n�meros voc� ir� digitar?");
		int num = in.nextInt();
		int []numeros =  new int [num];
	    double notas = 0;
		
		for ( int i= 0; i<numeros.length; i++) {
			System.out.println("Digite o n�mero # " + (i + 1) + ": ");
	        numeros[i] = in.nextInt();
	        notas += numeros[i];
	        System.out.println("A soma �: "+ numeros);
	        }
		System.out.println(notas/numeros.length);
		 System.out.println("A m�dia �: "+ numeros);
	}

}
