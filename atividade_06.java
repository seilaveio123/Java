import java.util.Scanner;
public class atividade_06 {

	public static void main(String[] args) {
		int num;
		System.out.println("Digite um numero para saber o seu fatorial: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		long fatorial = 1;
		int i = 1;
		
		while (i<= num) {
			fatorial = fatorial * i;
			i++;
		}
		
		System.out.println("O fatorial de " + num +" é " + fatorial);
		
		
	
	
	
	
	
	
	}
	}



