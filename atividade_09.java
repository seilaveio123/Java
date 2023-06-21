import java.util.Scanner;

import entidade.Retângulo;
public class atividade_09 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		Retângulo ret = new Retângulo();
		
		System.out.println("=== Programa para calcular as medidas de um retângulo ===");
		System.out.println("Digite a base do retângulo: ");
		ret.base = ler.nextDouble();
		double base = in.nextInt();
		System.out.println("Digite a altura do retângulo: ");
		ret.altura = ler.nextDouble();
		double area = ret.base * ret.altura;
		double perímetro = ret.CalcPerimetro();
		double diagonal = Math.sqrt((base * base) + (altura * altura));

		System.out.println("A medida da area é: " + area);
		System.out.println("A medida do perímetro é: " + perímetro);
		System.out.println("A medida da diagonal é: " + diagonal);
		
		
		
		
		
		
		
		
		
		
		
		
		in.close();
	}

}
