import java.util.Scanner;
public class soma_vetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos números você irá digitar?");
		int num = in.nextInt();
		int []numeros =  new int [num];
	    double notas = 0;
		
		for ( int i= 0; i<numeros.length; i++) {
			System.out.println("Digite o número # " + (i + 1) + ": ");
	        numeros[i] = in.nextInt();
	        notas += numeros[i];
	        System.out.println("A soma é: "+ numeros);
	        }
		System.out.println(notas/numeros.length);
		 System.out.println("A média é: "+ numeros);
	}

}
