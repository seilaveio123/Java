import java.util.Scanner;

import entidade.Ret�ngulo;
public class atividade_09 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		Ret�ngulo ret = new Ret�ngulo();
		
		System.out.println("=== Programa para calcular as medidas de um ret�ngulo ===");
		System.out.println("Digite a base do ret�ngulo: ");
		ret.base = ler.nextDouble();
		double base = in.nextInt();
		System.out.println("Digite a altura do ret�ngulo: ");
		ret.altura = ler.nextDouble();
		double area = ret.base * ret.altura;
		double per�metro = ret.CalcPerimetro();
		double diagonal = Math.sqrt((base * base) + (altura * altura));

		System.out.println("A medida da area �: " + area);
		System.out.println("A medida do per�metro �: " + per�metro);
		System.out.println("A medida da diagonal �: " + diagonal);
		
		
		
		
		
		
		
		
		
		
		
		
		in.close();
	}

}
