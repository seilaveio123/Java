import java.util.Scanner;
public class Negativos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos números você irá digitar?");
		int num = in.nextInt();
		int []números =  new int [num];
		
		for ( int i= 0; i<números.length; i++) {
			System.out.println("Digite o número # " + (i + 1) + ": ");
	        números[i] = in.nextInt();
	        }
		for (int x : números) {
			if ( x < 0) {
				System.out.println("Os números negativos são:" + x);
				
			}
		}
		
	}

}
