import java.util.Scanner;
public class atividade_08 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		System.out.println("Digite as medidas do primeiro tri�ngulo: ");
		double xA = in.nextInt();
		double xB = in.nextInt();
		double xC = in.nextInt();
		System.out.println("Digite as medidas do segundo tri�ngulo: ");
		double yA = in.nextInt();
		double yB = in.nextInt();
		double yC = in.nextInt();
		
		double pX = (xA + xB + xC)/2;
		double pY = (yA + yB + yC)/2;
		
		double areaX = Math.sqrt(pX*(pX - xA)* (pX - xB)* (pX - xC));
		double areaY = Math.sqrt(pY*(pY - yA)* (pY - yB)* (pY - yC));
		
		if (areaX > areaY) {
			System.out.println("A area do primeiro triangulo � maior!");
		}else {  
			System.out.println("A area do segundo triangulo � maior!");
		}
		
		
		
		
		
		
		
		
		
		in.close();
	}

}
