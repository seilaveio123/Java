import java.util.Scanner;
public class Atividade04 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("Digiyte um numero:");
        
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Digite um n�mero: ");
        
		num1 = in.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		
		num2 = in.nextInt();
		
	    if (num1 % num2 == 0) {
	    System.out.println("O numero ", num1, "� multiplo de ", num2 );
	    
	    }else if{
	    	System.out.println("O numero", num1, "N�o � multiplo de ", num2 );
	   
	    
	    }
	
	
	    in.close();
	}

}
