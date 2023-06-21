import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int num, num1;
		Scanner in= new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num = in.nextInt();
		System.out.println("Digite outro numero: ");
		num1 = in.nextInt();
		
		if(num > num1) {
			for(int i = num1; i <= num ; i++) {
				System.out.println("Numero " +i);
			}
			
			
		}else {
				
	        for(int i = num1; i <= num1 ; i++) {
	        	System.out.println("Numero " + i);
	        }
			
			}
		
		
		
		
		
		
		
		
		in.close();
		
	}

}
