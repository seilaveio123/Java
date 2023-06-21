import java.util.Scanner;
public class atividade_01 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		int num1 = 0;
		
		int num2 = 0;
		
		System.out.println("Digite um número: ");
		
		num1 = in.nextInt();
		
		System.out.println("Digite outro número: ");
		
		num2 = in.nextInt();
		
		
		int maior = Math.max(num1, num2);
		
		int menor = Math.min(num1, num2);
		
		for(int a = menor; a <= maior; a++) {
			
		System.out.println(a);
			
		}
		
		
	}

}
