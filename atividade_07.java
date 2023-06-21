import java.util.Scanner;
public class atividade_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Início da jogada: ");
		int inicio = in.nextInt();
		System.out.println("Final da jogada: ");
		int num = in.nextInt();
		if (inicio < num) {
			int horas = num - inicio;
			System.out.println("Você ficou " + horas + " horas jogando!");
			
		} else {
			int horas = (24 + num)- inicio;
			System.out.println("Você ficou " + horas + " horas jogando!");
		}
	}

}
