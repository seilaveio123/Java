package Aplicações;
import java.util.Scanner;
import Etntidade.Nota;
    
    public class Notas {
    public static void main(String[] args) {
		Scanner in =  new Scanner (System.in);
		Nota nota =  new Nota();
		
		System.out.println("Qual o seu nome?");
		nota.nome = in.next();
		System.out.println("Digite as notas dos 3 primeiros bimestres");
		nota.n1 = in.nextDouble();
		nota.n2 = in.nextDouble();
		nota.n3 = in.nextDouble();
		
		if(nota.CalcMedia() > 60) {
			System.out.println("Você foi aprovado");
			}else {
				System.out.println("Você não foi aprovado, faltou: "
						            + nota.CalcAprovacao()*-1 + " pontos");
			}
        in.close();
	}

}
