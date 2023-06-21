package sobre00;

import java.util.Scanner;

public class principal {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um dia");
		int d = in.nextInt();
		
		System.out.println("Digite um mes");
		int m = in.nextInt();
		
		System.out.println("Digite um ano");
		int a = in.nextInt();
		
		
		MinhaData data = new MinhaData(d, m, a);
		
		
		System.out.println("O ano Atual é: "+data);
	}
}
