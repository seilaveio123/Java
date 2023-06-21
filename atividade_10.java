import java.util.Scanner;
public class atividade_10 {

	
		Scanner in = new Scanner(System.in);
		String nome;
		double n1, n2, n3;
		
		public double CalceMédia() {
			
		
	
		
		System.out.println("Digite a nota do primeiro bimestre!");
		n1= in.nextInt();
		
		System.out.println("Digite a nota do segundo bimestre!");
		n2= in.nextInt();
		
		System.out.println("Digite a nota do terceiro bimestre!");
		n3= in.nextInt();
		
		return n1 + n2 + n3;
		}
	    public double CalcAprovacao() {
	    	if (CalcMédia () <60) {
	    		
	    	}
	    
	    }
}
